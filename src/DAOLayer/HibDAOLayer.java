/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAOLayer;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import OEMEntities.*;

/**
 *
 * @author kiosk
 */
public class HibDAOLayer
{

	private static SessionFactory sessionFactory;

	static
	{
		try
		{
			Configuration cfg = new Configuration();
			cfg.addAnnotatedClass(LoginMaster.class);
			cfg.configure();
			sessionFactory = cfg.buildSessionFactory();
		} catch (Throwable ex)
		{
			// Log the exception.
			System.err.println("Initial SessionFactory creation failed." + ex);
		}
	}

	public static SessionFactory getSessionFactory()
	{
		return sessionFactory;
	}

	public static Session getSession()
	{
		return sessionFactory.openSession();
	}
}
