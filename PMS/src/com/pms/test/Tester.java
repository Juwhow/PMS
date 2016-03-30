package com.pms.test;

import org.junit.Test;

import com.pms.beans.Property;
import com.pms.dao.impl.OwnerDaoImpl;
import com.pms.dao.impl.PropertyDaoImpl;
import com.pms.services.UserServices;

public class Tester {

	@Test
	public void tsetAddUser(){
		Property u =new Property();
		u.setUsername("nike");
		u.setPassword("huoji090805");
		PropertyDaoImpl userImpl =new PropertyDaoImpl();
		System.out.println(userImpl.addProperty(u));
		
	}
	@Test
	public  void test()
	{
		OwnerDaoImpl o = new OwnerDaoImpl();
		o.allOwnerId();
	}

	
}
