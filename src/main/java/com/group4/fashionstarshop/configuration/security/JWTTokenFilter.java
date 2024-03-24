package com.group4.fashionstarshop.configuration.security;

import java.io.IOException;
import java.util.List;

import javax.crypto.SecretKey;

import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.AuthorityUtils;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.filter.OncePerRequestFilter;

import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.security.Keys;
import jakarta.servlet.FilterChain;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

//public class JWTTokenFilter extends OncePerRequestFilter {
//
//    @Override
//    protected void doFilterInternal(HttpServletRequest request, HttpServletResponse response, FilterChain filterChain)
//            throws ServletException, IOException {
//
//        String jwt = request.getHeader(JWTConstant.JWT_HEADER);
//
//        if (jwt != null) {
//            jwt = jwt.substring(7);
//            try {
//                SecretKey key = Keys.hmacShaKeyFor(JWTConstant.SECRET_KEY.getBytes());
//                Claims claims = Jwts.parser().setSigningKey(key).build().parseClaimsJws(jwt).getBody();
//                String adminUserName = String.valueOf(claims.get("adminUserName"));
//                String authorities = String.valueOf(claims.get("authorities"));
//                List<GrantedAuthority> auths = AuthorityUtils.commaSeparatedStringToAuthorityList(authorities);
//                Authentication authentication = new UsernamePasswordAuthenticationToken(adminUserName, null, auths);
//                SecurityContextHolder.getContext().setAuthentication(authentication);
//            } catch (Exception e) {
//                throw new BadCredentialsException("Invalid token");
//            }
//        }
//
//        filterChain.doFilter(request, response);
////    }
//}
