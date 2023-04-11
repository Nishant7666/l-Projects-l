

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class calcy_front_end
 */
@WebServlet("/calcy_front_end")
public class calcy_front_end extends HttpServlet
{ 
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		 response.setContentType("text/html");
		 PrintWriter out = response.getWriter();
		 
		 
		 out.print("<form style = 'text-align:centre;' action = 'calcy_back_end' method = 'POST'>");
		 
		 out.print("<head>");
		 out.print("<title> Web-Calculator </title>");
		 out.print("</head>");
		 
		 out.print("<body style = ' background-color : blueviolet; '>");
		 
		 out.print("<h1 style = 'border-radius : 33px; background-color : lightblue; '> enter 1st number : <input type = 'text' name = 'num1' > </h1>");
		 out.print("<br>");
		 out.print("<h1> enter 2nd number : <input type = 'text' name = 'num2' style = border-radius : 7px; > </h1>");
		 out.print("<br>");
		 out.print("enter operations : <select <input type = 'text' name = 'cal'>> <option> + </option> <option <input type = 'text' name = 'cal'> - </option> <option <input type = 'text' name = 'cal'> * </option> <option <input type = 'text' name = 'cal'> / </option>  </select>");
		 out.print("<br>");
		 out.print("<button type='submit' name = 'calculate'> calculate </button>");
		 
		 out.print("</body>");
		 
		 out.print("</form>");
	}

}
