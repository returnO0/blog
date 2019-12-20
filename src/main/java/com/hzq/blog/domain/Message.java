package com.hzq.blog.domain;

import java.util.Date;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;
/**
 * @description (message)表实体类
 * @author zhaowei.zhang01@hand-china.com
 * @date 2019-12-20 20:06:21
 */
 
@TableName(value = "message")
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Message extends Domain {
    @TableField(value = "message")
    private String message;
}