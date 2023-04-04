package data.excel.Model;

import java.util.ArrayList;

import org.hibernate.Session;

import data.excel.Dto.ExclDto;
import data.excel.Util.XmlCfg;

public class ExclModel
{
	int result = 0;
	public int ListSave(ArrayList<ExclDto> ExclList)
	{
		Session Sf = XmlCfg.GetSession().openSession();
				Sf.beginTransaction();
				
		for(ExclDto EL : ExclList)
		{
			Sf.save(EL);
		}
		Sf.getTransaction().commit();
		Sf.close();
		
		return result;
	}
}
