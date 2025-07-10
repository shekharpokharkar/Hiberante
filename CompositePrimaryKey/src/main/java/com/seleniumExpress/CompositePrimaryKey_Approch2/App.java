package com.seleniumExpress.CompositePrimaryKey_Approch2;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		Configuration cfg = new Configuration();
		cfg.configure();
		cfg.addAnnotatedClass(Student.class);
		cfg.addAnnotatedClass(StudentId.class);

		SessionFactory sessionFactory = cfg.buildSessionFactory();

		Session session = sessionFactory.openSession();

		Transaction transaction = session.getTransaction();
		transaction.begin();

		Student stu = new Student();
		stu.setMarks("1256");
		stu.setStudentLang("Marathi");
		stu.setStudnetId(1023);
		stu.setStudentId(new StudentId("Kajal","Pune"));
		
		
		session.save(stu);
		
		//Student student = session.get(Student.class,new StudentId("Kajal","Pune"));
		//System.out.println(student);
		transaction.commit();
		sessionFactory.close();
	}
}
