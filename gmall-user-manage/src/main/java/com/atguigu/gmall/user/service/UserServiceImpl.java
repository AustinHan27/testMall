package com.atguigu.gmall.user.service;

import com.atguigu.gmall.bean.UserInfo;
import com.atguigu.gmall.service.UserService;
import com.atguigu.gmall.user.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import com.alibaba.dubbo.config.annotation.Service;
import tk.mybatis.mapper.entity.Example;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    UserMapper userMapper;

    @Override
    public List<UserInfo> getUserInfoListAll() {
        return userMapper.selectAll();
    }

    @Override
    public void addUser(UserInfo userInfo) { userMapper.insertSelective(userInfo); }

    @Override
    public void updateUser(UserInfo userInfo) { userMapper.updateByPrimaryKeySelective(userInfo);}

    @Override
    public void updateUserByName(String name, UserInfo userInfo) {
        Example example = new Example(UserInfo.class);
        example.createCriteria().andEqualTo("name",name);
        userMapper.updateByExampleSelective(userInfo,example);
    }

    @Override
    public void deleteUser(UserInfo userInfo) { userMapper.deleteByPrimaryKey(userInfo); }

    @Override
    public UserInfo getUserInfoById(String id) { return userMapper.selectByPrimaryKey(id);}
}
