package com.gcl.springsimplesite.dao;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.gcl.springsimplesite.dao.entity.User;
import com.gcl.springsimplesite.dao.mapper.UserMapper;
import org.springframework.stereotype.Service;

@Service
public class UserDao extends ServiceImpl<UserMapper, User> {

    public User findByUsername(String name) {
        return baseMapper.selectOne(new QueryWrapper<User>().lambda()
                .eq(User::getUsername, name));
    }
}
