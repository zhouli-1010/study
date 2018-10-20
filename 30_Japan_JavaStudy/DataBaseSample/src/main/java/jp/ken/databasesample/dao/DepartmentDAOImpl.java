/**
 * 
 */
package jp.ken.databasesample.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import jp.ken.databasesample.entity.Departments;

public class DepartmentDAOImpl implements DepartmentDAO<Departments>{

	private SessionFactory sessionFactory;
	
	public void setSessionFactory (SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
		
	}

	@Override
	@SuppressWarnings("unchecked")
	public List<Departments> allList(){
		Session session = sessionFactory.openSession();
		Query query = session.createQuery("FROM Departments");
		List<Departments> deptList = query.list();
		session.close();
		return deptList;
	}
	
}
