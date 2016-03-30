package com.pms.dao;

import java.util.List;

import com.pms.beans.Owner;


public interface IOwnerDao {
	public List<String> allOwnerId();
    public boolean addOwner(Owner o);
    public Owner getOwner(String ownerId);
    public boolean deleteOwner(Owner o);
    public boolean updateOwner(Owner o);
}
