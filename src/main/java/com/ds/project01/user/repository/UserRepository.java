package com.ds.project01.user.repository;


import org.apache.ibatis.annotations.Param;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.ds.project01.user.domain.UserEntity;

public interface UserRepository extends JpaRepository<UserEntity, String>{

	UserEntity findByUserId(String userId);
	
	/*
	 * @Query("select m from UserDto m where m.userId = :userId") UserEntity
	 * findByUserId(@Param("userId")String userId);
	 */
}