package com.seleniumExpress.Hibernate_CRUD;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.seleniumExpress.Hibernate_CRUD.Entity.Student;

public class DeleteStudent {

	public static void main(String[] args) {

		SessionFactory sessionFactory = HibernateUtils.getSessionFactory();
		Session session = sessionFactory.openSession();

		Transaction transaction = session.getTransaction();
		transaction.begin();
		Student student = session.get(Student.class,1);
		
		session.delete(student);
		
		transaction.commit();
		session.close();

	}
}
