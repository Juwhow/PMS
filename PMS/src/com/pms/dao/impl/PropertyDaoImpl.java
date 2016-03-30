package com.pms.dao.impl;

import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;

import com.pms.beans.Property;
import com.pms.dao.IPropertyDao;
import com.pms.util.DBUtil;
import com.pms.util.HibernateUtil;

public class PropertyDaoImpl extends DBUtil implements IPropertyDao{

	HibernateUtil util =new HibernateUtil();
	@Override
	public boolean addProperty(Property u) {
		
		return super.save(u);
		
	}

	@Override
	public Property getProperty(String username) {
        Session session =util.getSession();
        String hql ="from com.pms.beans.Property where username=?";
        try {
			Query q =session.createQuery(hql);
			q.setString(0, username);
			// q.setSerializable(0, username);
			 List list =q.list();
			 while(list.size()>0){
				 Property u =(Property) list.get(0);
				 return u;
			 }
		} catch (HibernateException e) {
			e.printStackTrace();
		}finally{
			session.close();
		}
		return null;
	}

	@Override
	public boolean deleteProperty(Property u) {
		
		return super.delete(u);
	}

	@Override
	public boolean updateProperty(Property u) {
	
		return super.update(u);
	}

}
