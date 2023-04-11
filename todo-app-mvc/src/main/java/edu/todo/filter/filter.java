package edu.todo.filter;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpFilter;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet Filter implementation class filter
 */
@WebFilter(urlPatterns = "/create_task")
public class filter extends HttpFilter implements Filter {
       
     
    public filter() 
    {
        super();
       
    }
 
	public void destroy()
	{
		 
	}
 
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException
	{
		 
		
		// type casting
		HttpServletRequest req = (HttpServletRequest) request;
		HttpServletResponse resp = (HttpServletResponse) response;
		
		//get the parameter from t he request
		String title = req.getParameter("title");
		String ScheduleOn = req.getParameter("schedule");
		
		//create array list
		ArrayList<String> error = new ArrayList<String>();
		
		//validate data 
		if(title == null || title.isEmpty())
		{
			error.add("the title should not be empty");
		}
		if(ScheduleOn == null || ScheduleOn.isEmpty())
		{
			error.add("the schedule should not be empty");
		}
		if(error.isEmpty())
		{
			chain.doFilter(request, response);
		}
		else
		{
			req.setAttribute("error", error);
			RequestDispatcher dis = req.getRequestDispatcher("create-task.jsp");
			dis.forward(req, resp);
		}
	}

	public void init(FilterConfig fConfig) throws ServletException
	{
		 
	}

}
