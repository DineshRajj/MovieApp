///*
// * To change this license header, choose License Headers in Project Properties.
// * To change this template file, choose Tools | Templates
// * and open the template in the editor.
// */
//package com.movie.app.services;
//
//import com.movie.app.models.User;
//import com.movie.app.repository.UserRepository;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.security.core.userdetails.UserDetails;
//import org.springframework.security.core.userdetails.UserDetailsService;
//import org.springframework.security.core.userdetails.UsernameNotFoundException;
//
///**
// *
// * @author dineshkumar.r
// */
//
//public class UserDetailsServiceImpl implements UserDetailsService{
//@Autowired
//	UserRepository userRepository;
//    @Override
//    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
//        User user = userRepository.findByUserName(username);
//			
//
//		return UserDetailsImpl.build(user);
//    }
//    
//}
