//package com.group4.fashionstarshop.service.implement;
//
//import java.util.ArrayList;
//import java.util.List;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.security.core.GrantedAuthority;
//import org.springframework.security.core.userdetails.User;
//import org.springframework.security.core.userdetails.UserDetails;
//import org.springframework.security.core.userdetails.UserDetailsService;
//import org.springframework.security.core.userdetails.UsernameNotFoundException;
//import org.springframework.stereotype.Service;
//
//import com.group4.fashionstarshop.model.Admin;
//import com.group4.fashionstarshop.repository.AdminRepository;
//
//@Service
//public class AdminServiceImpl implements UserDetailsService{
////	@Autowired
////	private AdminRepository adminRepository;
////	
////	public AdminServiceImpl(AdminRepository adminRepository) {
////		this.adminRepository = adminRepository;
////	}
////	@Override
////	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
////		Admin admin = adminRepository.findByAdminUsername(username);
////		if (admin == null) {
////			throw new UsernameNotFoundException("Can not see the account with: " + username);
////		}
////		List<GrantedAuthority> authorities = new ArrayList<>();
////		
////		return new User(admin.getAdminUserName(),admin.getAdminPassword(),authorities);
////	}
////	
//}
//
