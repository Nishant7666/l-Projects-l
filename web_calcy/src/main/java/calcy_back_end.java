

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class calcy_back_end
 */
@WebServlet("/calcy_back_end")
public class calcy_back_end extends HttpServlet 
{
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		
		String num1 = request.getParameter("num1");
		String num2 = request.getParameter("num2");
		String op = request.getParameter("cal");
		
		int num11 = Integer.parseInt(num1);
		int num22 = Integer.parseInt(num2);
		
		 switch(op)
		 {
		 case "+" : 
			 out.print(num11 + num22);
			 break;
			 
		 case "-" :
			 out.print(num11 - num22);
			 break;
			 
		 case "*" :
			 out.print(num11 * num22);
			 break;
			 
		 case "/" :
			 out.print(num11 / num22);
			 break;
		 
		default :
			out.print("invalid operation");
			break;
		 
		 }
	}

}
