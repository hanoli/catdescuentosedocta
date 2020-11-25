package com.hanoli.comun.dao.impl;

import java.io.Serializable;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import com.hanoli.catdescuentosedocta.ApplicationConfig;
import com.hanoli.comun.dao.GenericDAO;
import com.hanoli.comun.exception.DAOException;

public class GenericDAOImpl <T extends Serializable, K extends Serializable> implements GenericDAO<T,K> {
	
	@Autowired
	@Qualifier("sessionFactory")
	private SessionFactory sessionFactory;
	
	protected Session getSession() {
		
		Session session = null;
		Transaction transaction;
		
		
		try {
			try {
				
				session = sessionFactory.getCurrentSession();
				transaction = session.getTransaction();
				
				if(!transaction.isActive()) {
					transaction.begin();
				}
				
				return session;
				
			} catch (Exception e) {
				
				e.printStackTrace();
				sessionFactory = (SessionFactory)(new ApplicationConfig()).getSessionFactory();
				session = sessionFactory.getCurrentSession();
				transaction = session.getTransaction();
				transaction.begin();
				return session;
				
				
			}
		} catch (Exception e) {
			System.out.println(e);
		}
		
		return session;
	}
	
	
	
	protected void closeTransaction() throws DAOException {
		
		Session session;
		Transaction transaction;
		
		try {
			session = sessionFactory.getCurrentSession();
			transaction = session.getTransaction();
			
			if(transaction.getRollbackOnly()) {
				
				transaction.rollback();
			}else {
				transaction.commit();
			}	
		} catch (Exception e) {
			throw new DAOException(e);
		}
		
		
		
	}
	
	

}
