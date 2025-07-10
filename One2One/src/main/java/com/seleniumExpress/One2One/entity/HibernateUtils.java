package com.seleniumExpress.One2One.entity;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateUtils {
	
	private static SessionFactory sessionFactory =null;
	
	
	public static SessionFactory getSessionFactory()
	{
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		cfg.addAnnotatedClass(Student.class);
		cfg.addAnnotatedClass(Address.class);
		if(sessionFactory == null)
		{
			sessionFactory=cfg.buildSessionFactory();
		}
		return sessionFactory;
	}

}
