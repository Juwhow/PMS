package com.pms.dao.impl;

import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;

import com.pms.beans.Bill_Service;
import com.pms.dao.IBill_ServiceDao;
import com.pms.util.DBUtil;
import com.pms.util.HibernateUtil;

public class Bill_ServiceDaoImpl extends DBUtil implements IBill_ServiceDao{
	HibernateUtil util =new HibernateUtil();
	@Override
	public boolean addBill_Service(Bill_Service bs) {
		
		return super.save(bs);
		
	}

	@Override
	public Bill_Service getBill_Service(String bill_id) {
        Session session =util.getSession();
        String hql ="from com.wuyebao.beans.User where username=?";
        try {
			Query q =session.createQuery(hql);
			q.setString(0, bill_id);
			 List list =q.list();
			 while(list.size()>0){
				 Bill_Service bs =(Bill_Service) list.get(0);
				 return bs;
			 }
		} catch (HibernateException e) {
			e.printStackTrace();
		}finally{
			session.close();
		}
		return null;
	}

	@Override
	public boolean deleteBill_Service(Bill_Service bs) {
		
		return super.delete(bs);
	}

	@Override
	public boolean updateBill_Service(Bill_Service bs) {
	
		return super.update(bs);
	}
}
