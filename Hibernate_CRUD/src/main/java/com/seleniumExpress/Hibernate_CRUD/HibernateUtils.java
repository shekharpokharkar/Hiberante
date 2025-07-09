package com.seleniumExpress.Hibernate_CRUD;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.seleniumExpress.Hibernate_CRUD.Entity.Student;

public class HibernateUtils {
	
	private static SessionFactory sessionFactory =null;
	
	
	public static SessionFactory getSessionFactory()
	{
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		cfg.addAnnotatedClass(Student.class);

		if(sessionFactory == null)
		{
			sessionFactory=cfg.buildSessionFactory();
		}
		return sessionFactory;
	}

}
