package com.pms.dao;

import com.pms.beans.Community;


public interface ICommunityDao {
    public boolean addCommunity(Community c);
    public Community getCommunity(int id);
    public boolean deleteCommunity(Community c);
    public boolean updateCommunity(Community c);
}
