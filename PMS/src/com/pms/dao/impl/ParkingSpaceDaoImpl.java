package com.pms.dao.impl;

import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;

import com.pms.beans.ParkingSpace;
import com.pms.dao.IParkingSpaceDao;
import com.pms.util.DBUtil;
import com.pms.util.HibernateUtil;

public class ParkingSpaceDaoImpl extends DBUtil implements IParkingSpaceDao{
	
	HibernateUtil util =new HibernateUtil();
	@Override
	 public boolean addParkingSpace(ParkingSpace p) {
		
		return super.save(p);
		
	}

	@Override
	public ParkingSpace getParkingSpace(int id) {
        Session session =util.getSession();
        String hql ="from com.wuyebao.beans.ParkingSpace where id=?";
        try {
			Query q =session.createQuery(hql);
			q.setInteger(0, id);
			 List list =q.list();
			 while(list.size()>0){
				 ParkingSpace p =(ParkingSpace) list.get(0);
				 return p;
			 }
		} catch (HibernateException e) {
			e.printStackTrace();
		}finally{
			session.close();
		}
		return null;
	}

	@Override
	public boolean deleteParkingSpace(ParkingSpace p) {
		
		return super.delete(p);
	}

	@Override
	public boolean updateParkingSpace(ParkingSpace p) {
	
		return super.update(p);
	}
}
