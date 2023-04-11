package data.excel.Controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import data.excel.Dto.ExclDto;
import data.excel.Model.ExclModel;

 
@WebServlet("/ViewData")
public class ViewData extends HttpServlet 
{
	private static final long serialVersionUID = 1L;

	 
	 
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
 
				ExclModel exmdl=new ExclModel();
				 
				ArrayList<ExclDto> list= (ArrayList<ExclDto>) exmdl.ViewExcelData();
 				
				request.setAttribute("ExclList", list);
				RequestDispatcher dis=request.getRequestDispatcher("View/VwExcl.jsp");
				dis.forward(request, response);
			 

	}
	
}


