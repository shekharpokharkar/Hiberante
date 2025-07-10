package com.seleniumExpress.One2Many_BidirectionalMapping;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class App {
	public static void main(String[] args) {
		SessionFactory sessionFactory = HibernateUtils.getSessionFactory();

		Session session = sessionFactory.openSession();
		Transaction transaction = session.getTransaction();
		transaction.begin();

		/*
		 * Customer Dipak = new Customer();
		 * Dipak.setCustomerDateOfBirth(LocalDate.of(1995, 07, 05));
		 * Dipak.setCustomerName("Dipak"); Dipak.setCustomrCity("Nagar");
		 * 
		 * List<Product> productList = new ArrayList<>();
		 * 
		 * Product Boiler = new Product();
		 * Boiler.setProductDescription("This is Kirloskar Solar boiler");
		 * Boiler.setProductExpiration(LocalDate.of(2030, 07, 05));
		 * Boiler.setProductExpired(false); Boiler.setProductMfg(LocalDate.of(2024, 01,
		 * 25)); Boiler.setProductName("Boiler"); Boiler.setCustomer(Dipak);
		 * 
		 * Product CAR = new Product();
		 * CAR.setProductDescription("This is Mercedes Benz");
		 * CAR.setProductExpiration(LocalDate.of(2030,05,02));
		 * CAR.setProductExpired(false); CAR.setProductMfg(LocalDate.of(2020,02,03));
		 * CAR.setProductName("CAR"); CAR.setCustomer(Dipak);
		 * 
		 * 
		 * productList.add(CAR); productList.add(Boiler);
		 * 
		 * Dipak.setProduct(productList);
		 * 
		 * session.save(Dipak);
		 * 
		 * System.out.println("All Product saved");
		 */

		/*
		 * System.out.println("Fetch All Product"); Customer customer =
		 * session.get(Customer.class, 1);
		 * 
		 * System.out.println(customer); System.out.println("*******************");
		 * System.out.println("Product List:" + customer.getProduct());
		 */

		/*
		 * Customer customer = session.get(Customer.class, 1);
		 * 
		 * session.delete(customer);
		 * 
		 * System.out.println("Customer deleted successfully");
		 */

		/*
		 * System.out.println("Update Customer");
		 * 
		 * Customer customer = session.get(Customer.class, 2);
		 * customer.setCustomerName(customer.getCustomerName() + " Upddated");
		 * session.update(customer);
		 * 
		 * transaction.commit();
		 * 
		 * System.out.println("Customer updated Successfully");
		 */

		/*
		 * System.out.println("Fetch All Product"); Product product =
		 * session.get(Product.class, 5);
		 * 
		 * System.out.println(product);
		 * 
		 * System.out.println("****************");
		 * 
		 * System.out.println("Update Product");
		 * 
		 * product.setProductName(product.getProductName() + " Updated");
		 * 
		 * session.update(product);
		 * 
		 * transaction.commit();
		 */

		System.out.println("Delete Product");

		Product product = session.get(Product.class, 5);

		product.setCustomer(null);

		session.delete(product);

		System.out.println("Product Deleted");
		
		transaction.commit();

		session.close();

	}
}
