package com.pms.dao;

import com.pms.beans.Bill;


public interface IBillDao {
    public boolean addBill(Bill b);
    public Bill getBill(int id);
    public boolean deleteBill(Bill b);
    public boolean updateBill(Bill b);
}
