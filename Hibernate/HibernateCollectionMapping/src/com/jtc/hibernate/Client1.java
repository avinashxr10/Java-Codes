package com.jtc.hibernate;

import org.hibernate.*;
import java.util.*;

public class Client1 {
   
	public static void main(String[] args) {
        try {
            SessionFactory sf = HibernateUtil.getSessionFactory();
            Session session = sf.openSession();
            Transaction tx = session.beginTransaction();

            String crs[] = {"java", "JDBC", "SERVLET", "Hibernate"};

            List<String> ems = new ArrayList<String>();
            ems.add("aa@jtc");
            ems.add("bb@jtc");
            ems.add("cc@jtc");

            List<Integer> mks = new ArrayList<Integer>();
            mks.add(new Integer(100));
            mks.add(new Integer(99));
            mks.add(new Integer(98));

            Set<Long> phs = new HashSet<Long>();
            phs.add(new Long(1111));
            phs.add(new Long(2222));
            phs.add(new Long(3333));

            Map<String, Long> refs = new HashMap<String, Long>();
            refs.put("aaa", new Long(1111));
            refs.put("bbb", new Long(2222));
            refs.put("ccc", new Long(3333));

            Student stu = new Student(101, "Avinash", "B.Tech", crs, ems, mks, phs, refs);
            session.save(stu);
            tx.commit();
            session.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
