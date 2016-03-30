package com.pms.dao.impl;

import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;

import com.pms.beans.Owner;
import com.pms.dao.IBill_ServiceDao;
import com.pms.dao.IOwnerDao;
import com.pms.util.DBUtil;
import com.pms.util.HibernateUtil;

public class OwnerDaoImpl extends DBUtil implements IOwnerDao{
	HibernateUtil util =new HibernateUtil();
	@Override
	public boolean addOwner(Owner o) {
		
		return super.save(o);
		
	}

	@Override
	public Owner getOwner(String ownerId) {
        Session session =util.getSession();
        String hql ="from com.pms.beans.Owner where ownerId=?";
        try {
			Query q =session.createQuery(hql);
			q.setString(0, ownerId);
			 List list =q.list();
			 while(list.size()>0){
				 Owner o =(Owner) list.get(0);
				 return o;
			 }
		} catch (HibernateException e) {
			e.printStackTrace();
		}finally{
			session.close();
		}
		return null;
	}

	@Override
	public boolean deleteOwner(Owner o) {
		
		return super.delete(o);
	}

	@Override
	public boolean updateOwner(Owner o) {
	
		return super.update(o);
	}

	@Override
	public List<String> allOwnerId() {
		List<String> list = null;
		 Session session =util.getSession();
	        String hql ="select o.ownerId from com.pms.beans.Owner o";
	        try {
				Query q =session.createQuery(hql);
				list =(List<String>)q.list();
			} catch (HibernateException e) {
				e.printStackTrace();
			}finally{
				session.close();
			}
	        //System.out.println(list);
			return list;
	}
}
