package com.pms.dao;

import com.pms.beans.Bill_Service;

public interface IBill_ServiceDao {
    public boolean addBill_Service(Bill_Service bs);
    public Bill_Service getBill_Service(String bill_id);
    public boolean deleteBill_Service(Bill_Service bs);
    public boolean updateBill_Service(Bill_Service bs);
}
