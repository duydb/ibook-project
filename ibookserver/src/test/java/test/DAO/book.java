package test.DAO;

import java.util.List;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;

import com.webdev.dao.POJO.Book;
import com.webdev.helpers.HSessionFactoryHelper;

public class book {
	public static void main(String[] args){
		

		SessionFactory ss = new AnnotationConfiguration().configure().addResource("hibernate.cfg.xml")
				.buildSessionFactory();

		List<Book> books = ss.openSession()
				.createQuery("from Book").list();
//		return books;
		
//		List<Book> books = HSessionFactoryHelper.getInstance().openSession()
//				.createQuery("from Book").list();
		
		for(Book b: books){
			System.out.println(b.getBook_id());
		}
	}
}
