package com.fenqing.cloud.pojo;

import lombok.Data;

import java.util.Date;

/**
 * 菜单实体类
 */
@Data
public class Menu {

    /**
     * id
     */
    private Long id;

    /**
     * 父类id
     */
    private Long parentId;

    /**
     * 名称
     */
    private String name;

    /**
     * url
     */
    private String url;

    /**
     * 授权
     */
    private String perms;

    /**
     * 类型   0：目录   1：菜单   2：接口
     */
    private Integer type;

    /**
     * 图标类名
     */
    private String icon;

    /**
     * 排序
     */
    private Integer orderNum;

    /**
     * 创建时间
     */
    private Date createTime;

    /**
     * 修改时间
     */
    private Date updateTime;
}
