package com.pms.dao.impl;

import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;

import com.pms.beans.Community;
import com.pms.dao.ICommunityDao;
import com.pms.util.DBUtil;
import com.pms.util.HibernateUtil;

public class CommunityDaoImpl extends DBUtil implements ICommunityDao{
	HibernateUtil util =new HibernateUtil();
	@Override
	public boolean addCommunity(Community c) {
		
		return super.save(c);
		
	}

	@Override
	public Community getCommunity(int id) {
        Session session =util.getSession();
        String hql ="from com.wuyebao.beans.User where username=?";
        try {
			Query q =session.createQuery(hql);
			q.setInteger(0, id);
			 List list =q.list();
			 while(list.size()>0){
				 Community c =(Community) list.get(0);
				 return c;
			 }
		} catch (HibernateException e) {
			e.printStackTrace();
		}finally{
			session.close();
		}
		return null;
	}

	@Override
	public boolean deleteCommunity(Community c) {
		
		return super.delete(c);
	}

	@Override
	public boolean updateCommunity(Community c) {
	
		return super.update(c);
	}
}
