package com.group4.fashionstarshop.service;

import java.util.List;

import com.group4.fashionstarshop.model.Staff;

public interface StaffService {
	 	Staff createStaff(Staff staff);
	    Staff updateStaff(Long id, Staff staff);
	    Staff getStaff(Long id);
	    void deleteStaff(Long id);
	    List<Staff> getAllStaff();
}
