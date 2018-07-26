package org.greattimes.easyvue.system.controller;


import org.greattimes.easyvue.system.entity.User;
import org.greattimes.easyvue.system.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

/**
 * <p>
 * 用户表 前端控制器
 * </p>
 *
 * @author LiHua
 * @since 2018-07-27
 */
@RestController
@RequestMapping("/system/user")
public class UserController {
	@Autowired
	private IUserService userService;
	
	@RequestMapping("/query")
	public User test(){
		User user=userService.selectById(1);
		return user;
	}
}

