package com.seleniumExpress.Hibernate_CRUD;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.seleniumExpress.Hibernate_CRUD.Entity.Student;

public class UpdateStudent {

	public static void main(String[] args) {

		SessionFactory sessionFactory = HibernateUtils.getSessionFactory();
		Session session = sessionFactory.openSession();

		Transaction transaction = session.getTransaction();
		transaction.begin();
		Student student2 = session.get(Student.class,1);
		student2.setMarried(true);
		student2.setStudentCity("Manchar-updated");
		student2.setStudentname("shekhar-updated");
		student2.setStudentSalary(99999l);
		session.save(student2);
		
		transaction.commit();
		session.close();

	}
}
