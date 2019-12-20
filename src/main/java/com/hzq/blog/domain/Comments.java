package com.hzq.blog.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;
/**
 * @description (comments)表实体类
 * @author zhaowei.zhang01@hand-china.com
 * @date 2019-12-20 20:06:21
 */
 
@TableName(value = "comments")
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Comments extends Domain {
    @TableField(value = "bid")
    private String bid;
    
    @TableField(value = "content")
    private String content;
}