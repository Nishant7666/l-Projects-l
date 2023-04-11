package edu.todo.model;
import edu.todo.dto.Task;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class TaskModel
{
	final String INSERT
	= "INSERT into task(id,title,status,scheduleOn) VALUES (task_seq.nextval,?,?,?)";
	
	final String SELECT_ALL = "select * from task";
	
	public boolean save(Task task)
	{
		boolean result = false;
		try
		{
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con =
			DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","772250");
			PreparedStatement stmt = con.prepareStatement(INSERT);
			
			stmt.setString(1, task.getTitle());
			stmt.setString(2, task.getStatus());
			stmt.setDate(3, new java.sql.Date(task.getScheduleOn().getTime()));
			
			int count = stmt.executeUpdate();
			
			result = count > 0;
			con.close();
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
		return result;
	}
	
	public List<Task> getAllTasks()
	
	{
		ArrayList<Task> list = new ArrayList<Task>();
		try
		{
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con =
		    DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","772250");
			PreparedStatement stmt = con.prepareStatement(SELECT_ALL);
			 
			ResultSet rs = stmt.executeQuery();
			
			while(rs.next())
			{
				Task task = new Task();
				
			 
				task.setTitle(rs.getString("title"));
				task.setStatus(rs.getString("status"));
				task.setScheduleOn(rs.getDate("scheduleOn"));
				task.setUpdatedOn(rs.getDate("udatedOn"));      
				
				list.add(task);
				
			}
			con.close();
		}
		
		catch (Exception e)
		{
			e.printStackTrace();
		}
		return list;
	}
	
}
