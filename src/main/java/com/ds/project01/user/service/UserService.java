package com.ds.project01.user.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ds.project01.user.domain.UserEntity;
import com.ds.project01.user.dto.UserDto;
import com.ds.project01.user.repository.UserRepository;

@Service
public class UserService {
		
	@Autowired
	private UserRepository dao;
	
	public void insert(UserEntity dto) {
		dao.save(dto);
	}
	public void update(UserEntity dto) {
		dao.save(dto);
	}
	public void delete(UserEntity dto) {
		dao.delete(dto);
	}
	
	public UserEntity view(UserEntity dto) { 
	return dao.findByUserId(dto.getUserId());
	}
	
	 
}

