package com.atguigu.gmall.user.controller;

import com.atguigu.gmall.bean.UserInfo;
import com.atguigu.gmall.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {
    @Autowired
    UserService userService;
    @GetMapping("getAllUsers")
    public List<UserInfo> getAllUsers(){ return userService.getUserInfoListAll();}
    @PostMapping("addUser")
    public String addUser(UserInfo userInfo){
        userService.addUser(userInfo);
        return "success";
    }
    @PostMapping("updateUser")
    public String updateUser(UserInfo userInfo){
        userService.updateUser(userInfo);
        return "success";
    }
    @PostMapping("deleteUser")
    public String deleteUser(UserInfo userInfo){
        userService.deleteUser(userInfo);
        return "success";
    }
    @PostMapping("updateByName")
    public String updateByName(UserInfo userInfo){
        userService.updateUserByName(userInfo.getName(),userInfo);
        return "success";
    }
    @PostMapping("getUserInfoById")
    public UserInfo getUser(String id){
        return userService.getUserInfoById(id);
    }
}
