package org.gaocl.demo.dao;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.gaocl.demo.Entity.MyUser;

import java.util.List;

@Mapper
public interface UserDao {

    @Select("select * from t_user")
    public List<MyUser> findAll();

    @Select("select * from t_user where username=#{username}")
    public MyUser findByName(String username);

    @Insert("insert into t_user (username, password) values(#{username}, #{password})")
    public int save(MyUser user);
}
