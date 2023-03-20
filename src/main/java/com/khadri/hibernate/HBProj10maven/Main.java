package com.khadri.hibernate.HBProj10maven;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.khadri.hibernate.entity.Remote;

public class Main {
	public static void main(String[] args) {
 
		Configuration cfg = new Configuration();
		cfg.configure();
		SessionFactory factory = cfg.buildSessionFactory();
		Session session = factory.openSession();
		Transaction txn = session.beginTransaction();

		Remote remote = new Remote();
		remote.setName("SAMSUNG");
		session.save(remote);

		txn.commit();
		session.close();
		factory.close();

	}
}
