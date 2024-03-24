package com.group4.fashionstarshop.service;

import com.group4.fashionstarshop.controller.exception.AdminException;
import com.group4.fashionstarshop.model.Admin;

public interface AdminService {
	public Admin findAdminProfileByJwt(String jwt) throws AdminException;
}

