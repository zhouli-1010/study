package jp.ken.bookstore.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import jp.ken.bookstore.entity.Product;

public class ProductDAOImpl implements ProductDAO<Product>{
	private SessionFactory sessionFactory;
	
	public void setSessionFactory(SessionFactory sessionFactory){
		this.sessionFactory = sessionFactory;
	}
	
	@Override
	@SuppressWarnings("unchecked")
	public List<Product> allList() {
		Session session = this.sessionFactory.openSession();
		Query query = session.createQuery("From Product");
		List<Product> product = query.list();
		session.close();
		
		return product;
	}
}
