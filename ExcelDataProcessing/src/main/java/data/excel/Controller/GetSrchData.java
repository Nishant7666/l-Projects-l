package data.excel.Controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import data.excel.Dto.ExclDto;
import data.excel.Model.ExclModel;

 
@WebServlet("/GetSrchData")
public class GetSrchData extends HttpServlet {
	private static final long serialVersionUID = 1L;

	 
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{

		String search_data =request.getParameter("search");
		String colmn = request.getParameter("column");
		
          
			ExclModel model=new ExclModel();
			List<ExclDto> list	= model.DataSearch(search_data,colmn);
			
			request.setAttribute("search_data", list);
//			
//			request.setAttribute("excel_list", list);
//			RequestDispatcher dis=request.getRequestDispatcher("View.jsp");
//			dis.forward(request, response);
	}

}
