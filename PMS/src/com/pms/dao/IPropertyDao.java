package com.pms.dao;

import com.pms.beans.Property;

public interface IPropertyDao {
     public boolean addProperty(Property u);
     public Property getProperty(String username);
     public boolean deleteProperty(Property u);
     public boolean updateProperty(Property u);
}
