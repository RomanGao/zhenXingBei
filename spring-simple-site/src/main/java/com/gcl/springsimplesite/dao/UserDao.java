package com.gcl.springsimplesite.dao;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.gcl.springsimplesite.dao.entity.UserEntity;
import com.gcl.springsimplesite.dao.mapper.UserMapper;
import org.springframework.stereotype.Service;

@Service
public class UserDao extends ServiceImpl<UserMapper, UserEntity> {

    public UserEntity findByUsername(String name) {
        return baseMapper.selectOne(new QueryWrapper<UserEntity>().lambda()
                .eq(UserEntity::getUsername, name));
    }
}
