package com.seleniumExpress.Hibernate_CRUD;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.seleniumExpress.Hibernate_CRUD.Entity.Student;

public class UpdateVsMerge {

	public static void main(String[] args) {

		SessionFactory sessionFactory = HibernateUtils.getSessionFactory();
		Session session = sessionFactory.openSession();

		Transaction transaction = session.getTransaction();
		transaction.begin();
		Student student = session.get(Student.class, 2);
		transaction.commit();
		session.close();

		System.out.println(student);
		System.out.println("Session closed");

		student.setStudentname(student.getStudentname() + "updated");

		Session session2 = sessionFactory.openSession();

		Student student2 = session2.get(Student.class, 2);
		System.out.println("New one:" + student2);
		System.out.println("old one:" + student);
		Transaction transaction2 = session2.beginTransaction();
		session2.merge(student);
		transaction2.commit();
		session2.close();

	}

}
