package com.pms.dao;

import com.pms.beans.Service;


public interface IServiceDao {
    public boolean addService(Service s);
    public Service getService(int id);
    public boolean deleteService(Service s);
    public boolean updateService(Service s);
}
