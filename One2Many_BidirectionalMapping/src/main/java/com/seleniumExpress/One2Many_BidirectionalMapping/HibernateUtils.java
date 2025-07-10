package com.seleniumExpress.One2Many_BidirectionalMapping;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateUtils {
	
	private static SessionFactory sessionFactory =null;
	
	
	public static SessionFactory getSessionFactory()
	{
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		cfg.addAnnotatedClass(Customer.class);
		cfg.addAnnotatedClass(Product.class);

		if(sessionFactory == null)
		{
			sessionFactory=cfg.buildSessionFactory();
		}
		return sessionFactory;
	}

}
