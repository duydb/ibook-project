package com.webdev.server.dao;

import java.util.Date;
import java.util.List;

import org.hibernate.Query;

import com.webdev.server.POJO.Book;
import com.webdev.server.util.iBookHibernateUtil;

public class BookImpl implements BookDAO {
	public Book get(int id) {
		Book result = null;

		Query query = iBookHibernateUtil.getSessionFactory().openSession()
				.createQuery("from Book where bookId = :id");
		query.setParameter("id", id);

		List tmp = query.list();

		if (tmp.size() > 0)
			result = (Book) tmp.get(0);

		return result;
	}

	public Book get(String code) {
		Book result = null;

		Query query = iBookHibernateUtil.getSessionFactory().openSession()
				.createQuery("from Book where bookCode = :code");
		query.setParameter("id", code);

		List tmp = query.list();

		if (tmp.size() > 0)
			result = (Book) tmp.get(0);
		return result;
	}

	public List<Book> getByCategory(int cateId, int from, int size) {
		List<Book> result = null;

		Query query = iBookHibernateUtil
				.getSessionFactory()
				.openSession()
				.createQuery(
						"from Book as b, BookCat as bc where b.bookId = bc.bookId and bc.catId = :cateId");
		query.setParameter("cateId", cateId);

		result = query.list().subList(from, from + size);
		return result;
	}

	public List<Book> getByCategory(String tag, int from, int size) {
		List<Book> result = null;

		Query query = iBookHibernateUtil
				.getSessionFactory()
				.openSession()
				.createQuery(
						"from Book as b, Category as c, BookCat as bc where b.bookId = bc.bookId and bc.catId = c.cateId and c.tag = :tag");
		query.setParameter("tag", tag);

		result = query.list().subList(from, from + size);
		return result;
	}

	public List<Book> getByDate(Date begin, Date end, int from, int size) {
		List<Book> result = null;

		Query query = iBookHibernateUtil
				.getSessionFactory()
				.openSession()
				.createQuery(
						"from Book where publicDate >= :begin and publicDate <= :end");
		query.setParameter("begin", begin);
		query.setParameter("end", end);

		result = query.list().subList(from, from + size);
		return result;
	}
//bug
	public List<Book> getPrice(float lte, float gte, int from, int size) {
		List<Book> result = null;

		Query query = iBookHibernateUtil.getSessionFactory().openSession()
				.createQuery("from Book where price >= :lte and price <= :gte");
		query.setParameter("lte", lte);
		query.setParameter("gte", gte);

		result = query.list().subList(from, from + size);
		return result;
	}

	public List<Book> getRandom(int size) {
		List<Book> result = null;

		Query query = iBookHibernateUtil.getSessionFactory().openSession()
				.createQuery("from Book order by rand()").setMaxResults(size);

		result = query.list();
		return result;
	}

	public List<Book> getNew(int from, int size) {
		List<Book> result = null;

		Query query = iBookHibernateUtil.getSessionFactory().openSession()
				.createQuery("from Book order by publicDate DESC")
				.setMaxResults(size);

		result = query.list();
		return result;
	}

	public List<Book> getRecommend(int idBook, int from, int size) {
		List<Book> result = null;

		Query query = iBookHibernateUtil
				.getSessionFactory()
				.openSession()
				.createQuery(
						"from Book as b, Category as c, BookCat as bc where b.bookId = bc.bookId and bc.catId = c.cateId and bc.catId <> :id and bc.catId = b.cateId");
		query.setParameter("id", idBook);

		result = query.list().subList(from, from + size);
		return result;
	}

	public int update(Book newBook) {
		Query query = iBookHibernateUtil
				.getSessionFactory()
				.openSession()
				.createQuery(
						"update Book set bookCode = :bookCode,"
								+ "comments = :comments,"
								+ "coverFormat = :coverFormat,"
								+ "dateModify = :dateModify,"
								+ "description = :description,"
								+ "imageCover = :imageCover,"
								+ "orderDetails = :orderDetails,"
								+ "pagesNum = :pagesNum," + "price = :price,"
								+ "priceSale = :priceSale,"
								+ "publicDate = :publicDate,"
								+ "rates = :rates," + "title = :title,"
								+ "weight = :weight,"
								+ "where bookId = :bookId");

		query.setParameter("bookId", newBook.getBookId());
		query.setParameter("bookCode", newBook.getBookCode());
		query.setParameter("comments", newBook.getComments());
		query.setParameter("coverFormat", newBook.getCoverFormat());
		query.setParameter("dateModify", newBook.getDateModify());
		query.setParameter("description", newBook.getDescription());
		query.setParameter("imageCover", newBook.getImageCover());
		query.setParameter("orderDetails", newBook.getOrderDetails());
		query.setParameter("pagesNum", newBook.getPagesNum());
		query.setParameter("price", newBook.getPrice());
		query.setParameter("priceSale", newBook.getPriceSale());
		query.setParameter("publicDate", newBook.getPublicDate());
		query.setParameter("rates", newBook.getRates());
		query.setParameter("title", newBook.getTitle());
		query.setParameter("weight", newBook.getWeight());
		int result = query.executeUpdate();
		return result;
	}

	public int delete(int id) {
		Query query = iBookHibernateUtil.getSessionFactory().openSession()
				.createQuery("delete Book where bookId = :bookId");

		query.setParameter("bookId", id);
		int result = query.executeUpdate();
		return result;
	}
}
