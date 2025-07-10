package com.seleniumExpress.Many_2_Many_BidirectionlMapping;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateUtils {
	
	private static SessionFactory sessionFactory =null;
	
	
	public static SessionFactory getSessionFactory()
	{
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		cfg.addAnnotatedClass(Actor.class);
		cfg.addAnnotatedClass(Movie.class);
		if(sessionFactory == null)
		{
			sessionFactory=cfg.buildSessionFactory();
		}
		return sessionFactory;
	}

}
