package test_hibernate;


import java.util.List;

import org.hibernate.Session;

import com.webdev.server.POJO.Book;
import com.webdev.server.util.iBookHibernateUtil;

public class simple {
	public static void main(String[] args){
		long start = System.currentTimeMillis();
		
		System.out.println("START");
		
		iBookHibernateUtil util = new iBookHibernateUtil();
		Session sess = util.getSessionFactory().openSession();
		
		List<Book> books = sess.createQuery("from Book").list();
		
		for (Book b: books) {
			System.out.print(b.getBookId());
			System.out.print(" - ");
			System.out.print(b.getDescription());
			System.out.print("/");
		}
		long end = System.currentTimeMillis();
		System.out.println("");
		System.out.println(end-start);
		System.out.println("END");
	}
}