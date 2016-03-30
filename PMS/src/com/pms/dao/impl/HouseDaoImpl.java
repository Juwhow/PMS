package com.pms.dao.impl;

import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;

import com.pms.beans.House;
import com.pms.dao.IHouseDao;
import com.pms.util.DBUtil;
import com.pms.util.HibernateUtil;

public class HouseDaoImpl extends DBUtil implements IHouseDao{
	HibernateUtil util =new HibernateUtil();
	@Override
	public boolean addHouse(House a) {
		
		return super.save(a);
		
	}

	@Override
	public House getHouse(String id) {
        Session session =util.getSession();
        String hql ="from com.pms.beans.House where houseId=?";
        try {
			Query q =session.createQuery(hql);
			q.setString(0, id);
			 List list =q.list();
			 while(list.size()>0){
				 House a =(House) list.get(0);
				 return a;
			 }
		} catch (HibernateException e) {
			e.printStackTrace();
		}finally{
			session.close();
		}
		return null;
	}

	@Override
	public boolean deleteHouse(House a) {
		
		return super.delete(a);
	}

	@Override
	public boolean updateHouse(House a) {
	
		return super.update(a);
	}
}
