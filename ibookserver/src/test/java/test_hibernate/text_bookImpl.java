package test_hibernate;

import com.webdev.server.POJO.Book;
import com.webdev.server.dao.BookImpl;

public class text_bookImpl {
	public static void main(String[] args){
		System.out.println("START");
		
		
		BookImpl b = new BookImpl();
		Book result = b.get(5);
		System.out.println(result.getBookId());
		System.out.println("END");
	}
}
