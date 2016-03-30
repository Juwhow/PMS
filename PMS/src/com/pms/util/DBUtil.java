package com.pms.util;

import java.io.Serializable;
import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class DBUtil {

	public boolean save(Object obj) {
	   HibernateUtil util =new HibernateUtil();
	   Session session =util.getSession();
	   Transaction tran =session.beginTransaction();
		try {
			session.save(obj);
			tran.commit();
			return true;
		} catch (HibernateException e) {
			e.printStackTrace();
		}finally{
			session.close();
		}
		
		return false;
	}

	public Object get(Class clz, Serializable id) {
         HibernateUtil util =new HibernateUtil();
         Session session=util.getSession();
         try {
			return session.get(clz, id);
		} catch (HibernateException e) {
			e.printStackTrace();
		}finally{
			session.close();
		}
		
		return null;
	}

	public boolean update(Object obj) {
		HibernateUtil util =new HibernateUtil();
		Session session =util.getSession();
		Transaction tran =session.beginTransaction();
		try {
			session.update(obj);
			tran.commit();
			return true;
		} catch (HibernateException e) {
			e.printStackTrace();
			tran.rollback();
		}finally{
			session.close();
		}
		return false;
		
	}

	public boolean delete(Object obj) {
		HibernateUtil util =new HibernateUtil();
		Session session =util.getSession();
		Transaction tran =session.beginTransaction();
		try {
			session.delete(obj);
			tran.commit();
			return true;
		} catch (HibernateException e) {
			e.printStackTrace();
			tran.rollback();
		}finally{
			session.close();
		}
		return false;
	}

	public List list(String hql) {
		HibernateUtil util =new HibernateUtil();
		Session session =util.getSession();
		try {
			Query q =session.createQuery(hql);
			return q.list();
		} catch (HibernateException e) {
			e.printStackTrace();
		}finally{
			session.close();
		}
		return null;
	}
}
