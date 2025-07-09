package com.seleniumExpress.EmbeddedVsEmbeddable;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.seleniumExpress.EmbeddedVsEmbeddable.entity.Address1;
import com.seleniumExpress.EmbeddedVsEmbeddable.entity.HibernateUtils;
import com.seleniumExpress.EmbeddedVsEmbeddable.entity.Student;

public class App {
	public static void main(String[] args) {
		SessionFactory sessionFactory = HibernateUtils.getSessionFactory();
		Session session = sessionFactory.openSession();

		Transaction transaction = session.getTransaction();
		transaction.begin();
		Address1 homeAddress = new Address1("S corner", "Pimpalgaon Road", "Manchar", "Pune");
		Address1 hostelAddress = new Address1("KarveRoad", "Warje malwadi", "Deccan", "Nashik");

		Student student = new Student();
		student.setHomeAddress(homeAddress);
		student.setHostelAddress(hostelAddress);
		student.setMarried(true);
		student.setStudentCity("Mumbai");
		student.setStudentname("Dipak");
		student.setStudentSalary(85263l);

		session.save(student);

		transaction.commit();

		session.close();
	}
}
