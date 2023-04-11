package edu.todo.create_task;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import edu.todo.dto.Task;
import edu.todo.model.TaskModel;


@WebServlet("/create_task")
public class create_task extends HttpServlet
{
	private static final long serialVersionUID = 1L;
 
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		 // get data from create task
		
		String title = request.getParameter("title");
		String status = request.getParameter("gridRadios");
		String scheduleOn = request.getParameter("schedule");
		SimpleDateFormat formate = new SimpleDateFormat("dd-mm-yyyy");
		Date date = null;
		
		try
		{
			date = formate.parse(scheduleOn);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
		// get the data int dto
		Task task = new Task();
		task.setTitle(title);
		task.setStatus(status);
		task.setScheduleOn(date);
		
		// pass data into model class in form of dto
		TaskModel model = new TaskModel();
		boolean result = model.save(task);
		
		String code = result ? "1" : "0";
		
		//redirect to create task page
		response.sendRedirect("create-task.jsp?c="+code);
	}

}
