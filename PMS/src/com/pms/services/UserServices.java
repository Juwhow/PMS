/**
 * 
 */
package com.pms.services;
import java.util.List;

import com.pms.beans.House;
import com.pms.beans.Owner;
import com.pms.beans.ParkingSpace;
import com.pms.dao.impl.HouseDaoImpl;
import com.pms.dao.impl.OwnerDaoImpl;
import com.pms.dao.impl.ParkingSpaceDaoImpl;
import com.pms.util.Common;

/**
 * @author 
 *@version 
 */
public class UserServices extends Common{

	@Override
	public boolean register(String username, String password,String email) {
		return super.register(username, password, email);
	}

	@Override
	public String login(String username, String password) {
	
		return super.login(username, password);
	}
	
	@Override
	public String forgetPassword(String username ,String email)
	{	
		return super.forgetPassword(username, email);
		
	}
	
	@Override
	public House getHouse(String id) {
		return super.getHouse(id);
	}
	//like:addHouse?houseId=H004&buildingNo=132&houseArea=111&houseType=sdasd
	@Override
	public boolean addHouse(String houseId, String buildingNo, int houseArea, String houseType) {	
		return super.addHouse(houseId, buildingNo, houseArea, houseType);	
	}
	
	@Override
	public String checkEmail()
	{
		return super.checkEmail();
	}
	
	//返回所有用户ID
	@Override
	public List<String> allOwnerId()
	{
		return super.allOwnerId();
	}
	
	@Override
	public Owner getOwner(String id)
	{
		return super.getOwner(id);
	}
	
	@Override
	public boolean addOwner(String ownerId, String ownerName, String tel, String IDCardNo,
			String houseId, String parkingSpaceId) {
			return super.addOwner(ownerId, ownerName, tel, IDCardNo, houseId, parkingSpaceId);
	}
	
	@Override
	public boolean deleteOwner(String id)
	{
		return super.deleteOwner(id);
	}
   
}
