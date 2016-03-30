package com.pms.dao.impl;

import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;

import com.pms.beans.FeedbackFrom;
import com.pms.dao.IFeedbackFromDao;
import com.pms.util.DBUtil;
import com.pms.util.HibernateUtil;

public class FeedbackFromDaoImpl extends DBUtil implements IFeedbackFromDao{
	HibernateUtil util =new HibernateUtil();
	@Override
	public boolean addFeedbackFrom(FeedbackFrom f) {
		
		return super.save(f);
		
	}

	@Override
	public FeedbackFrom getFeedbackFrom(int feedbackFrom_id) {
        Session session =util.getSession();
        String hql ="from com.wuyebao.beans.User where username=?";
        try {
			Query q =session.createQuery(hql);
			q.setInteger(0, feedbackFrom_id);

			 List list =q.list();
			 while(list.size()>0){
				 FeedbackFrom f =(FeedbackFrom) list.get(0);
				 return f;
			 }
		} catch (HibernateException e) {
			e.printStackTrace();
		}finally{
			session.close();
		}
		return null;
	}

	@Override
	public boolean deleteFeedbackFrom(FeedbackFrom f) {
		
		return super.delete(f);
	}

	@Override
	public boolean updateFeedbackFrom(FeedbackFrom f) {
	
		return super.update(f);
	}
}
