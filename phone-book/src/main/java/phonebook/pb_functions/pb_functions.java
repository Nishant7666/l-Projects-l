package phonebook.pb_functions;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

 
import phonebook.dto.pb_objects;

public class pb_functions 
{
	final String INSERT
	= " INSERT into phonebook (id,'name',contact,'address','bussiness','city','state',pin)";
	
	final String UPDATE = "update phonebook set contact=? where name=?";
	
	final String SELECT_ALL = " select * from phonebook";
	
	final String SEARCH = "select contact=? from phonebook where name=? ";
	
	public boolean save(pb_objects  obj)
	{
		boolean result = false;
		try
		{
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","772250");
			PreparedStatement stmt = con.prepareStatement(INSERT);
			
			stmt.setString(1, obj.getName());
			stmt.setInt(2, obj.getContact());
			stmt.setString(3, obj.getAddress());
			stmt.setString(4,obj.getBussiness());
			stmt.setString(5, obj.getCity());
			stmt.setString(6, obj.getState());
			stmt.setInt(7, obj.getPin());
			 
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
	
	public boolean update(pb_objects obj)
	{
		boolean result = false;
		
		try
		{
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","772250");
			PreparedStatement stmt = con.prepareStatement(UPDATE);
			
			stmt.setInt(1, obj.getContact());
			stmt.setString(2,  obj.getName());
			
			int count = stmt.executeUpdate();
			
			result = count > 0;
			con.close();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
		return result;
	}
	
	public List<pb_objects> result()
	{
		ArrayList<pb_objects> list = new ArrayList<pb_objects>();
		try
		{
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","772250");
			PreparedStatement stmt = con.prepareStatement(SELECT_ALL);
			 
			ResultSet rs = stmt.executeQuery();
			
			while(rs.next())
			{
				pb_objects obj = new  pb_objects();
				
			 
				obj.setName(rs.getString("name"));
				obj.setContact(rs.getInt("contact"));
				obj.setAddress(rs.getString("address"));
				obj.setBussiness(rs.getString("bussiness"));
				obj.setCity(rs.getString("city"));
				obj.setState(rs.getString("state"));
				obj.setPin(rs.getInt("pin"));
				 
				list.add(obj);
				
			}
			con.close();
		}
		
		catch (Exception e)
		{
			e.printStackTrace();
		}
		return list;
	}
	
	public List<pb_objects> search(pb_objects obj)
	{
		ArrayList<pb_objects> list = new ArrayList<pb_objects>();
		try
		{
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","772250");
		PreparedStatement stmt = con.prepareStatement(SEARCH);
		
		stmt.setInt(1, obj.getContact());
		stmt.setString(2,  obj.getName());
		
		
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return list;
	}
}
