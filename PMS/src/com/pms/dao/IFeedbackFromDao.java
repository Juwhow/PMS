package com.pms.dao;

import com.pms.beans.FeedbackFrom;


public interface IFeedbackFromDao {
    public boolean addFeedbackFrom(FeedbackFrom f);
    public FeedbackFrom getFeedbackFrom(int feedbackFrom_id);
    public boolean deleteFeedbackFrom(FeedbackFrom f);
    public boolean updateFeedbackFrom(FeedbackFrom f);
}
