/**
 * 
 */
package jp.ken.databasesample.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import jp.ken.databasesample.entity.Employees;

public class EmployeeDAOImpl implements EmployeeDAO<Employees>{

	private SessionFactory sessionFactory;
	
	public void setSessionFactory (SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
		
	}

	@Override
	@SuppressWarnings("unchecked")
	public List<Employees> allList(){
		Session session = sessionFactory.openSession();
		Query query = session.createQuery("FROM Employees");
		List<Employees> empList = query.list();
		session.close();
		return empList;
	}

	@Override
	public Employees getById(int id) {
		Session session = sessionFactory.openSession();
		Query query = session.createQuery("FROM Employees WHERE employee_id = ?");
		query.setParameter(0, id);
		Employees emp = (Employees)query.uniqueResult();
		session.close();
		return emp;
	}

	@Override
	@SuppressWarnings("unchecked")
	public List<Employees> getByName(String name) {
		Session session = sessionFactory.openSession();
		Query query = session.createQuery("FROM Employees WHERE employee_name LIKE ?");
		query.setParameter(0, "%" + name + "%");
		List<Employees> list = query.list();
		session.close();
		return list;
	}
	
}
