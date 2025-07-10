package com.seleniumExpress.One2One;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.seleniumExpress.One2One.entity.Address;
import com.seleniumExpress.One2One.entity.HibernateUtils;
import com.seleniumExpress.One2One.entity.Student;

public class App {
	public static void main(String[] args) {
		SessionFactory sessionFactory = HibernateUtils.getSessionFactory();

		Session session = sessionFactory.openSession();
		Transaction transaction = session.getTransaction();
		transaction.begin();
		/*
		 * Address address = new Address(); address.setAddressLine1("Yerawada1");
		 * address.setAddressLine2("Housing board1"); address.setCountry("India1");
		 * address.setPin("410 511");
		 * 
		 * Student shadab = new Student(); shadab.setAddress(address);
		 * shadab.setMarried(true); shadab.setStudentCity("Pune1");
		 * shadab.setStudentname("shadab1"); shadab.setStudentSalary(88888l);
		 * 
		 * 
		 * 
		 * System.out.
		 * println("************Save the student simultaneously Address also save***********"
		 * ); session.save(shadab);
		 * 
		 * System.out.
		 * println("************get the student simultaneously Address also get**************"
		 * );
		 * 
		 * Student student = session.get(Student.class, 1);
		 * 
		 * System.out.println(student);
		 * 
		 * System.out.
		 * println("***********Update the student simultaneously Address can also get Updated**************"
		 * );
		 * 
		 * student.setStudentname(student.getStudentname() + " Updated");
		 * student.getAddress().setAddressLine1(student.getAddress().getAddressLine1() +
		 * " Updated");
		 * 
		 * System.out.
		 * println("***********delete the student simultaneously Address can also get ddeleted**************"
		 * );
		 * 
		 * Student student3 = session.get(Student.class, 3); session.delete(student3);
		 */

		/*
		 * Address address1 = new Address(); address1.setAddressLine1("Yerawada2");
		 * address1.setAddressLine2("Housing board2"); address1.setCountry("India2");
		 * address1.setPin("369 258");
		 * 
		 * session.save(address1);
		 */

		System.out.println("***********delete the student simultaneously Address can also get ddeleted**************");

		Address address = session.get(Address.class, 1);
		System.out.println(address);
		
		
		
		transaction.commit();

		session.close();
	}
}
