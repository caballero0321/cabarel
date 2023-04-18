package com.ds.project01.user.domain;

import com.ds.project01.user.dto.UserDto;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Lob;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
 
@Getter
@Setter
@Entity
@ToString
@Table(name="user_tb")
public class UserEntity {
	
	@Id
	@Column(name="user_id", length=100, nullable=false, unique=true)
	private String userId;
	
	
	@Column(name="user_nm", length=100, nullable=false)
	private String userNm;
	
	
	@Column(name="user_eml_addr", length=320, nullable=false)
	private String userEmlAddr;
	
	@Column(name="user_dept_nm", length=200)
	private String userDeptNm;
	
	@Column(name="user_telno", length=11)
	private String userTelno;
	
	
	@Column(name="user_addr", length=500)
	private String userAddr;
	
	
	@Column(name="user_aprv_yn", length=1)
	private String userAprvYn;

	public static UserEntity toUserEntity(UserDto dto) {
	UserEntity entity = new UserEntity();
	entity.setUserId(dto.getUserId());
	entity.setUserNm(dto.getUserNm());
	entity.setUserEmlAddr(dto.getUserEmlAddr());
	entity.setUserDeptNm(dto.getUserDeptNm());
	entity.setUserTelno(dto.getUserTelno());
	entity.setUserAddr(dto.getUserAddr());
	entity.setUserAprvYn(dto.getUserAprvYn());
		
	return entity;
	
	}
  }


