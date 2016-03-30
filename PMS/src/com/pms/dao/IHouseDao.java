package com.pms.dao;

import com.pms.beans.House;

public interface IHouseDao {
    public boolean addHouse(House a);
    public House getHouse(String id);
    public boolean deleteHouse(House a);
    public boolean updateHouse(House a);
}
