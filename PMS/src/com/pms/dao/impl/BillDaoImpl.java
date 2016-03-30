package com.pms.dao.impl;

import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;

import com.pms.beans.Bill;
import com.pms.dao.IBillDao;
import com.pms.util.DBUtil;
import com.pms.util.HibernateUtil;

public class BillDaoImpl extends DBUtil implements IBillDao{
	HibernateUtil util =new HibernateUtil();
	@Override
	public boolean addBill(Bill b) {
		
		return super.save(b);
		
	}

	@Override
	public Bill getBill(int id) {
        Session session =util.getSession();
        String hql ="from com.wuyebao.beans.User where username=?";
        try {
			Query q =session.createQuery(hql);
			q.setInteger(0, id);
			 List list =q.list();
			 while(list.size()>0){
				 Bill b =(Bill) list.get(0);
				 return b;
			 }
		} catch (HibernateException e) {
			e.printStackTrace();
		}finally{
			session.close();
		}
		return null;
	}

	@Override
	public boolean deleteBill(Bill b) {
		
		return super.delete(b);
	}

	@Override
	public boolean updateBill(Bill b) {
	
		return super.update(b);
	}
}
