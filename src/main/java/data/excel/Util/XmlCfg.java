package data.excel.Util;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class XmlCfg
{
	public static final SessionFactory GetSession()
	{
		Configuration Cfg = new Configuration();
		Cfg.configure("ExclDtLd.xml");
		
		return Cfg.buildSessionFactory();
	}
}
