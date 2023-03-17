package com.gcl.springsimplesite.dao.mapper;


import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.gcl.springsimplesite.dao.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.security.core.userdetails.UserDetails;

@Mapper
public interface UserMapper extends BaseMapper<User> {

}
