package com.group4.fashionstarshop.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.group4.fashionstarshop.model.Admin;
@Repository
public interface AdminRepository extends JpaRepository<Admin, Long>{
	@Query("SELECT a FROM Admin a WHERE a.adminUserName LIKE :adminUserName")
	public Admin findByAdminUsername (@Param("adminUserName") String adminUserName);

}
