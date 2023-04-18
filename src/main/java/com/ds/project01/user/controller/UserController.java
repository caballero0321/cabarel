package com.ds.project01.user.controller;

import java.util.List;

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
public class UserController {
	
	private UserService userService;
	
	@Autowired
    public MemberController(MemberService memberService) {
		this.memberService = memberService;
	}
	
    @GetMapping("/user/new")
    public String showUserForm(UserDto dto) {
    	     	
        return "userForm";
    }
    
    @PostMapping("/user/new") 
    public String saveUser(UserDto dto) {
    	UserEntity entity = UserEntity.toUserEntity(dto);
    	userService.insert(entity);
    	return "redirect:/"; 
    }
    
    @GetMapping("/users")
    public String list(Model model) {
    List<User> users = userService.
    model.addAttribute("users", users);
    return "userList";
    }
    
}