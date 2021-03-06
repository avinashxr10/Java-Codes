package com.jtcindia.hibernate;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;

public class HibernateUtil {
    static SessionFactory factory = null;
    static {
        try{
            AnnotationConfiguration cfg = new AnnotationConfiguration();
            cfg = cfg.configure("hibernate.cfg.xml");
            factory = cfg.buildSessionFactory();
        }catch (Exception e){
            e.printStackTrace();
        }
    }
    public static SessionFactory getSessionFactory(){
        return factory;
    }
}
