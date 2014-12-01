package com.webdev.helpers;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;

import sun.security.jca.GetInstance.Instance;

public class HSessionFactoryHelper {
	private static SessionFactory sessionFactory = null; 
	private static HSessionFactoryHelper instance = null;
	
	private HSessionFactoryHelper(){
		
	}
	
	public static HSessionFactoryHelper getInstance(){
		if (HSessionFactoryHelper.instance == null){
			HSessionFactoryHelper.instance = new HSessionFactoryHelper();
			
			initSession();
		}
		
		return HSessionFactoryHelper.instance;
	}

	public static void initSession() {
		
		HSessionFactoryHelper.sessionFactory = new AnnotationConfiguration().configure().addResource("hibernate.cfg.xml")
				.buildSessionFactory();
	}
	
	public SessionFactory getSessionFactory(){
		return sessionFactory;
	}
	
	public Session openSession(){
		return sessionFactory.openSession();
	}
	
	public void closeSession(){
		sessionFactory.close();
	}
}
