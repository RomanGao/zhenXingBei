package com.gcl.springsimplesite.dao.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

@TableName("T_ROLE")
public class RoleEntity {
    @TableId(value = "ID", type = IdType.AUTO)
    private Long id;

    private String roleCode;

    private String roleName;
}
