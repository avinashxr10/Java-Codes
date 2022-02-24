package com.jtcindia.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;


public class Client1 {
    @SuppressWarnings("unused")
	public static void main(String[] args) {
        Transaction tx = null;
        try {
            SessionFactory sf = HibernateUtil.getSessionFactory();
            Session session = sf.openSession();
            tx = session.beginTransaction();

            Customer anno = new Customer(101, "Avinash", "akgpcamp@gmail.com", 93340, "Dhanbad", 1000.00);

            session.save(anno);
            session.close();
            sf.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
