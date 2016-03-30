package com.pms.dao;

import com.pms.beans.ParkingSpace;

public interface IParkingSpaceDao {
    public boolean addParkingSpace(ParkingSpace p);
    public ParkingSpace getParkingSpace(int id);
    public boolean deleteParkingSpace(ParkingSpace p);
    public boolean updateParkingSpace(ParkingSpace p);
}
