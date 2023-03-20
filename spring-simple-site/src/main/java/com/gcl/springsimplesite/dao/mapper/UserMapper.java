package com.gcl.springsimplesite.dao.mapper;


import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.gcl.springsimplesite.dao.entity.UserEntity;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserMapper extends BaseMapper<UserEntity> {

}
