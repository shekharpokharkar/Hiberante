package com.seleniumExpress.CollectionTable_CompositeCollectionType;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

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

		SessionFactory sessionFactory = cfg.buildSessionFactory();

		Session session = sessionFactory.openSession();

		Transaction transaction = session.getTransaction();
		transaction.begin();

		Student stu = new Student();
		stu.setStudentCity("Manchar");
		stu.setStudentName("Shadab");

		List<String> nickName = new ArrayList<>();
		nickName.add("abhi");
		nickName.add("Selenium");
		nickName.add("Abhilash");
		stu.setNickNames(nickName);
		
		Map<String,Integer>marks=new HashMap<>();
		marks.put("Marathi",98);
		marks.put("English",60);
		marks.put("Science",84);
		marks.put("Hindi",81);
		marks.put("Maths",100);
		marks.put("SocialScience",96);
		stu.setSubjectMarks(marks);
		
		session.save(stu);
		transaction.commit();
		sessionFactory.close();
	}
}
