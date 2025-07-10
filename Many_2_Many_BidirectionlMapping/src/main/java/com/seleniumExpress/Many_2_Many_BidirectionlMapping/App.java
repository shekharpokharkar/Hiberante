package com.seleniumExpress.Many_2_Many_BidirectionlMapping;

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

		Movie pk = new Movie();
		pk.setMovieDirector("Rajkumar Hirani");
		pk.setMovieName("Pk");

		Movie kranti = new Movie();
		kranti.setMovieDirector("Sanjay Lila Bhansali");
		kranti.setMovieName("kranti");

		Movie natsamrat = new Movie();
		natsamrat.setMovieDirector("Mahesh Manjrekar");
		natsamrat.setMovieName("natsamrat");

		List<Movie> nanaPatekarMovie = new ArrayList<>();
		nanaPatekarMovie.add(natsamrat);
		nanaPatekarMovie.add(kranti);

		Actor nanapatear = new Actor();
		nanapatear.setActorName("Nana patekar");
		nanapatear.setMovieList(nanaPatekarMovie);

		List<Movie> amirKhanMovie = new ArrayList<>();
		amirKhanMovie.add(pk);
		amirKhanMovie.add(kranti);

		Actor Amirkhan = new Actor();
		Amirkhan.setActorName("Amir khan");
		Amirkhan.setMovieList(amirKhanMovie);

		List<Movie> kajolMovielist = new ArrayList<>();
		kajolMovielist.add(pk);
		kajolMovielist.add(kranti);
		kajolMovielist.add(natsamrat);

		Actor kajol = new Actor();
		kajol.setActorName("kajol");
		kajol.setMovieList(kajolMovielist);

		List<Actor> krantiActorList = new ArrayList<>();
		krantiActorList.add(kajol);
		krantiActorList.add(nanapatear);
		krantiActorList.add(Amirkhan);

		List<Actor> natsamratActorList = new ArrayList<>();
		natsamratActorList.add(kajol);
		natsamratActorList.add(nanapatear);

		List<Actor> PKActorList = new ArrayList<>();
		PKActorList.add(Amirkhan);
		PKActorList.add(kajol);

		pk.setActorList(PKActorList);
		kranti.setActorList(krantiActorList);
		natsamrat.setActorList(natsamratActorList);

		session.save(pk);
		session.save(natsamrat);
		session.save(kranti);
		transaction.commit();

		
		System.out.println("saved all");
		session.close();

	}
}
