/**
 * 
 */
package com.pms.util;

import java.util.List;

import org.apache.axis2.context.MessageContext;
import org.apache.axis2.context.ServiceGroupContext;

import com.pms.beans.House;
import com.pms.beans.Owner;
import com.pms.beans.Property;
import com.pms.dao.impl.HouseDaoImpl;
import com.pms.dao.impl.OwnerDaoImpl;
import com.pms.dao.impl.PropertyDaoImpl;
import com.pms.mail.test_mail;

public class Common {

	public boolean register(String username, String password, String email) {

		PropertyDaoImpl propertyImpl = new PropertyDaoImpl();

		if (username == null || password == null || "".equals(username)
				|| "".equals(password)) {
			return false;
		}
		if (propertyImpl.getProperty(username) == null) {
			Property u = new Property();
			u.setPassword(password);
			u.setUsername(username);
			u.setEmail(email);
			System.out.println(email);
			if (propertyImpl.addProperty(u)) {

				test_mail sendmail = new test_mail();
				try {
					String content = "Click the link to verify: http://"+ Configuration.IP +":8080/PMS/activateEmail.jsp";
					String subject = "Check Register";
					sendmail.send(email, content, subject);
				} catch (Exception ex) {
					System.out.println("Email Failed");
				}
				return true;

			} else {
				return false;
			}

		}

		return false;

	}

	public String checkEmail() {
		return "Register Successfully";
	}

	protected Object getProperty(String key) {
		MessageContext ms = MessageContext.getCurrentMessageContext();
		ServiceGroupContext serviceGroupContext = ms.getServiceGroupContext();

		return serviceGroupContext.getProperty(key);
	}

	protected void setProperty(String key, Object value) {
		MessageContext ms = MessageContext.getCurrentMessageContext();
		ServiceGroupContext serviceGroupContext = ms.getServiceGroupContext();

		serviceGroupContext.setProperty(key, value);
	}

	public String login(String username, String password) {
		PropertyDaoImpl userImpl = new PropertyDaoImpl();
		Property u = userImpl.getProperty(username);
		if(u==null)
			return "nonExistent";
		if ((u.getUsername().equals(username))
				&& (u.getPassword().equals(password))) {

			setProperty("login", username);
			return "true";
		}
		return "passwordWrong";
	}
	
	public String forgetPassword(String username ,String email)
	{
		
		PropertyDaoImpl userImpl = new PropertyDaoImpl();
		Property u = userImpl.getProperty(username);
		if(u==null)
			return "nonExistent";
		
		if(email.equals(u.getEmail()))
		{
			test_mail sendmail = new test_mail();
			try {
				String content = "Password: "+u.getPassword();
				String subject = "Forget The Password";
				sendmail.send(email, content, subject);
			} catch (Exception ex) {
				System.out.println("Email Failed");
			}
			return "true";
		}

		
		return "wrongEmail";
		
	}

	public House getHouse(String id) {
		HouseDaoImpl dao = new HouseDaoImpl();
		House dd = dao.getHouse(id);
		return dd;
	}

	public boolean addHouse(String houseId, String buildingNo, int houseArea,
			String houseType) {
		HouseDaoImpl dao = new HouseDaoImpl();
		House h = new House(houseId, buildingNo, houseArea, houseType);

		if (dao.addHouse(h))
			return true;
		else
			return false;
	}
	
	
	public List<String> allOwnerId()
	{
		OwnerDaoImpl o = new OwnerDaoImpl();
		return o.allOwnerId();
	}
	
	public Owner getOwner(String id)
	{
		OwnerDaoImpl o = new OwnerDaoImpl();	
		return o.getOwner(id);
	}
	
	public boolean addOwner(String ownerId, String ownerName, String tel, String IDCardNo,
	String houseId, String parkingSpaceId) {
		OwnerDaoImpl dao = new OwnerDaoImpl();
		Owner owner = new Owner( ownerId,  ownerName,  tel,  IDCardNo,
				 houseId,  parkingSpaceId);

		if (dao.addOwner(owner))
			return true;
		else
			return false;
	}
	
	public boolean deleteOwner(String id)
	{
		OwnerDaoImpl dao = new OwnerDaoImpl();
		Owner o =  dao.getOwner(id);
		if(o==null)
			return false;
		else
		{
			dao.deleteOwner(o);
		}
		
		return true;
	}


}
