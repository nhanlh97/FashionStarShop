//package com.group4.fashionstarshop.controller;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.http.HttpStatus;
//import org.springframework.http.ResponseEntity;
//import org.springframework.security.authentication.BadCredentialsException;
//import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
//import org.springframework.security.core.Authentication;
//import org.springframework.security.core.context.SecurityContextHolder;
//import org.springframework.security.core.userdetails.UserDetails;
//import org.springframework.security.crypto.password.PasswordEncoder;
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.RequestBody;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RestController;
//
//import com.group4.fashionstarshop.configuration.security.JWTAuthenticationProvider;
//import com.group4.fashionstarshop.controller.exception.AdminException;
//import com.group4.fashionstarshop.dto.AdminDTO;
//import com.group4.fashionstarshop.dto.AuthResponse;
//import com.group4.fashionstarshop.model.Admin;
//import com.group4.fashionstarshop.repository.AdminRepository;
//import com.group4.fashionstarshop.service.implement.AdminServiceImpl;
//
//
////@RestController
////@RequestMapping("/auth")
//public class AuthenticationController {
//
////	private AdminRepository adminRepository;
////	private JWTAuthenticationProvider jwtAuthenticationProvider;
////	private PasswordEncoder passwordEncoder;
////	private AdminServiceImpl adminServiceImpl;
////	
////	
////	public AuthenticationController(AdminRepository adminRepository,
////			JWTAuthenticationProvider jwtAuthenticationProvider, PasswordEncoder passwordEncoder,
////			AdminServiceImpl adminServiceImpl) {
////		super();
////		this.adminRepository = adminRepository;
////		this.jwtAuthenticationProvider = jwtAuthenticationProvider;
////		this.passwordEncoder = passwordEncoder;
////		this.adminServiceImpl = adminServiceImpl;
////	}
////
////	@PostMapping("/signup")
////	public ResponseEntity<AuthResponse> createAdminHandler(@RequestBody Admin admin) throws AdminException {
////		String adminUserName = admin.getAdminUserName();
////		String adminPassword = admin.getAdminPassword();
////		String adminConfirmPassword = admin.getAdminConfirmPassword();
////		String admiName = admin.getAdminName();
////		String adminEmail = admin.getAdminEmail();
////		
////		if (!adminPassword.equals(adminConfirmPassword)) {
////			throw new AdminException("Password and Confirm Password must be the same");
////		}
////		
////		Admin isUsernameExist = adminRepository.findByAdminUsername(adminUserName);
////		if (isUsernameExist != null) {
////			throw new AdminException("Username is used already");
////		}
////		Admin createdAdmin = new Admin();
////		createdAdmin.setAdminUserName(adminUserName);
////		createdAdmin.setAdminPassword(passwordEncoder.encode(adminPassword));
////		createdAdmin.setAdminName(admiName);
////		createdAdmin.getAdminEmail();
////		
////		Admin saveAdmin = adminRepository.save(createdAdmin);
////		
////		Authentication authentication = new UsernamePasswordAuthenticationToken(saveAdmin.getAdminUserName(), saveAdmin.getAdminPassword());
////		SecurityContextHolder.getContext().setAuthentication(authentication);
////		
////		String token = jwtAuthenticationProvider.generateToken(authentication);
////		AuthResponse authResponse = new AuthResponse(token, "Sign up success");
////		return new ResponseEntity<AuthResponse>(authResponse,HttpStatus.CREATED);
////	}
////	
////	@PostMapping("/signin")
////	public ResponseEntity<AuthResponse> loginAdminHandler(@RequestBody AdminDTO adminDTO){
////		
////		String adminUserName = adminDTO.getAdminUserName();
////		String adminPassword = adminDTO.getAdminPassword();
////		
////		Authentication authentication = authenticate(adminUserName, adminPassword);
////		String token = jwtAuthenticationProvider.generateToken(authentication);
////		AuthResponse authResponse = new AuthResponse(token, "Sign in success");
////		return new ResponseEntity<AuthResponse>(authResponse,HttpStatus.CREATED);
////		
////	}
////	
////	private Authentication authenticate(String username, String password) {
////
////		UserDetails userDetails = adminServiceImpl.loadUserByUsername(username);
////		if (userDetails == null) {
////			throw new BadCredentialsException("Invalid username");
////		}
////		if (passwordEncoder.matches(password, userDetails.getPassword())) {
////			throw new BadCredentialsException("Invalid password");
////		}
////		return new UsernamePasswordAuthenticationToken(userDetails,null,userDetails.getAuthorities());
////	}
//}
//
