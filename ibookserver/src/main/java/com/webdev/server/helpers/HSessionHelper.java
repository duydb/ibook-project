package com.webdev.server.helpers;

import org.hibernate.SessionFactory;

import com.webdev.server.util.iBookHibernateUtil;

public class HSessionHelper {
	private static HSessionHelper instance = null;
	private static iBookHibernateUtil util = null;
	
	private HSessionHelper() {
	}
	
	public static HSessionHelper getInstance(){
		if (instance == null){
			instance = new HSessionHelper();
		}
		return instance;
	}
	
	public static SessionFactory getSessionFactory(){
		if (util == null)
			util = new iBookHibernateUtil();
		
		return util.getSessionFactory();
	}
}
