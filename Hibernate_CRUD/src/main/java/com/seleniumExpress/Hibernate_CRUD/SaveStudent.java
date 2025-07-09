package com.seleniumExpress.Hibernate_CRUD;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.seleniumExpress.Hibernate_CRUD.Entity.Student;

public class SaveStudent {

	public static void main(String[] args) {

		SessionFactory sessionFactory = HibernateUtils.getSessionFactory();
		Session session = sessionFactory.openSession();

		Transaction transaction = session.getTransaction();
		transaction.begin();
		Student student = new Student();
		student.setMarried(false);
		student.setStudentCity("Manchar");
		student.setStudentname("shekhar");
		student.setStudentSalary(12365l);

		session.save(student);
		transaction.commit();
		session.close();

	}
}
