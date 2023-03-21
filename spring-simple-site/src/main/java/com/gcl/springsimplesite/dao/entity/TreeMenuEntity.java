package com.gcl.springsimplesite.dao.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

@TableName("T_TREE_MENU")
public class TreeMenuEntity {
    @TableId(value = "ID", type = IdType.AUTO)
    private Long id;
    /**
     * 资源路径
     */
    private String resourceUrl;

    /**
     * 资源名称
     */
    private String resourceName;

}
