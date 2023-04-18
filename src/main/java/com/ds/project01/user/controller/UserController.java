package com.ds.project01.user.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.security.SecurityProperties.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.ds.project01.user.domain.UserEntity;
import com.ds.project01.user.dto.UserDto;
import com.ds.project01.user.service.UserService;

@Controller
public class UserController {//test
	
	@Autowired
    private UserService userService;
	
    @GetMapping("/user")
    public String showUserForm(UserDto dto) {
    	    	
        return "userForm";
    }
    
    @PostMapping("/user/save") 
    public String saveUser(UserDto dto) {
    	UserEntity entity = UserEntity.toUserEntity(dto);
    	userService.insert(entity);
    	return ""; 
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    

//    @PostMapping("/user")
//    public String submitEmployeeForm(User user, BindingResult result) {
//        if (result.hasErrors()) {
//            return "userForm";
//        }
//
//        return "userConfirmation";
//    }
}