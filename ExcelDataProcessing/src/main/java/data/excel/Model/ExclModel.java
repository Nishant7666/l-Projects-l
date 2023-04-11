package data.excel.Model;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.query.NativeQuery;

import data.excel.Dto.ExclDto;
import data.excel.Util.XmlCfg;

public class ExclModel
{
	int result = 0;
	public int ListSave(List<ExclDto> exclst)
	{
		Session sf = XmlCfg.GetSession().openSession();
		sf.beginTransaction();
				
		for(ExclDto el : exclst)
		{
			sf.save(el);
		}
		sf.getTransaction().commit();
		sf.close();
		
		return result;
	}
	
	public List<ExclDto> DataSearch(String value,String column)
	{
		ArrayList<ExclDto> arr = new ArrayList<>();
		try
		{
		 Session session = XmlCfg.GetSession().getCurrentSession();
		 session.beginTransaction();
		 String srch = "select * from ExclDto where "+column+" like '%" +value+ "%'";
		 
		 NativeQuery<ExclDto> qry = session.createNativeQuery(srch, ExclDto.class);
		 arr = (ArrayList<ExclDto>) qry.getResultList();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		 	
		return arr;
	}
	
	public List<ExclDto> ViewExcelData()
	{
		 
		ArrayList<ExclDto> arr = new ArrayList<>();
		String qry = "select * from ExclDto where rownum <= 50";
		
		try
		{
			Session sf = XmlCfg.GetSession().openSession();
			sf.beginTransaction();
			
			NativeQuery<ExclDto> qry1 = sf.createNativeQuery(qry, ExclDto.class);
			arr = (ArrayList<ExclDto>) qry1.getResultList();
			
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		 
		return arr;
	}
}
