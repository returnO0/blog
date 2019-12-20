package com.hzq.blog.domain;

import java.util.Date;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;
/**
 * @description (user)表实体类
 * @author zhaowei.zhang01@hand-china.com
 * @date 2019-12-20 20:06:22
 */
 
@TableName(value = "user")
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class User extends Domain {
    @TableField(value = "account_id")
    private String accountId;
    
    @TableField(value = "password")
    private String password;
    
    @TableField(value = "name")
    private String name;
    
    @TableField(value = "head_img")
    private String headImg;
    
    @TableField(value = "create_time")
    private Date createTime;
    
    @TableField(value = "last_update_time")
    private Date lastUpdateTime;
    
}