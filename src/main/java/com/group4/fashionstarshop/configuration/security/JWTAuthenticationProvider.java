package com.group4.fashionstarshop.configuration.security;

import java.util.Date;

import javax.crypto.SecretKey;

import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Service;

import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.security.Keys;

@Service
public class JWTAuthenticationProvider {
//	   SecretKey key = Keys.hmacShaKeyFor(JWTConstant.SECRET_KEY.getBytes());
//
//		
//		public String generateToken(Authentication auth) {
//			String jwt = Jwts.builder()
//					.issuedAt(new Date())
//					.expiration(new Date(new Date().getTime()+486000000))
//					.claim("adminUserName", auth.getName())
//					.signWith(key).compact();
//			
//			return jwt;
//		}
//		
//		public String getEmailFromToken(String jwt) {
//			jwt = jwt.substring(7);
//			
//
//	        Claims claims = Jwts.parser().verifyWith(key).build().parseSignedClaims(jwt).getPayload();
//
//	        String adminUserName = String.valueOf(claims.get("adminUserName"));
//	        return adminUserName;
//		}
}
