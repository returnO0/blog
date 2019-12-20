package com.hzq.blog.domain;

import java.util.Date;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;
/**
 * @description (label)表实体类
 * @author zhaowei.zhang01@hand-china.com
 * @date 2019-12-20 20:06:21
 */
 
@TableName(value = "label")
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Label extends Domain {
    @TableField(value = "name")
    private String name;
    
    @TableField(value = "des")
    private String des;
    
    @TableField(value = "create_time")
    private Date createTime;
    
    @TableField(value = "last_update_time")
    private Date lastUpdateTime;
    
}