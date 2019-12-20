package com.hzq.blog.domain;

import java.util.Date;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;
/**
 * @description (blog)表实体类
 * @author zhaowei.zhang01@hand-china.com
 * @date 2019-12-20 20:06:18
 */
 
@TableName(value = "blog")
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Blog extends Domain {
    @TableField(value = "title")
    private String title;
    
    @TableField(value = "author")
    private String author;
    
    @TableField(value = "text")
    private String text;
    
    @TableField(value = "label")
    private String label;
    
    @TableField(value = "type")
    private String type;
    
    @TableField(value = "browses")
    private Integer browses;
    

    
}