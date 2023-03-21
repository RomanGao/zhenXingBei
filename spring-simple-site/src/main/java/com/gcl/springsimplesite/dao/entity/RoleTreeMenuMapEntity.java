package com.gcl.springsimplesite.dao.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

@Data
@TableName("T_ROLE_TREE_MENU_MAP")
public class RoleTreeMenuMapEntity {
    @TableId(value = "ID", type = IdType.AUTO)
    private Long id;

    /**
     * 角色代码
     */
    private String roleCode;
    /**
     * 资源链接
     */
    private String resourceUrl;

}
