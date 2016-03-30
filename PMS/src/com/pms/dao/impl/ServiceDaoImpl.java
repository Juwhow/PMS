package com.pms.dao.impl;

import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;

import com.pms.beans.Service;
import com.pms.dao.IServiceDao;
import com.pms.util.DBUtil;
import com.pms.util.HibernateUtil;

public class ServiceDaoImpl extends DBUtil implements IServiceDao{
	HibernateUtil util =new HibernateUtil();
	@Override
	public boolean addService(Service s) {
		
		return super.save(s);
		
	}

	@Override
	public Service getService(int id) {
        Session session =util.getSession();
        String hql ="from com.wuyebao.beans.User where username=?";
        try {
			Query q =session.createQuery(hql);
			q.setInteger(0, id);
			 List list =q.list();
			 while(list.size()>0){
				 Service s =(Service) list.get(0);
				 return s;
			 }
		} catch (HibernateException e) {
			e.printStackTrace();
		}finally{
			session.close();
		}
		return null;
	}

	@Override
	public boolean deleteService(Service s) {
		
		return super.delete(s);
	}

	@Override
	public boolean updateService(Service s) {
	
		return super.update(s);
	}
}
