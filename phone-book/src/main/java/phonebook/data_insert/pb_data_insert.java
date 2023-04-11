package phonebook.data_insert;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import phonebook.dto.pb_objects;

/**
 * Servlet implementation class pb_data_insert
 */
@WebServlet("/pb_data_insert")
public class pb_data_insert extends HttpServlet
{
	private static final long serialVersionUID = 1L;
 
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		 String name = request.getParameter("name");
		 
		 String cont = request.getParameter("contact");
		 int contact = Integer.parseInt(cont);
		 
		 String address = request.getParameter("bussiness");
		 
		 String bussiness = request.getParameter("bussiness");
		 
		 String city = request.getParameter("city");
		 
		 String state = request.getParameter("state");
		 
		 String p = request.getParameter("pin");
		 int pin = Integer.parseInt("p");
		 
		 // set the data into object format
		 pb_objects obj = new pb_objects();
		 
		 obj.setName(name);
		 obj.setContact(contact);
		 obj.setAddress(address);
		 obj.setBussiness(bussiness);
		 obj.setCity(city);
		 obj.setState(state);
		 obj.setPin(pin);
		 
		 // pass the data into pb_funtctions
		 
		 
		 
		 
		
		 
	}

}
