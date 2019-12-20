package com.hzq.blog.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.databind.ser.std.ToStringSerializer;
/**
 * @description (diary)表实体类
 * @author zhaowei.zhang01@hand-china.com
 * @date 2019-12-20 20:06:21
 */
 
@TableName(value = "diary")
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Diary extends Domain {
    @TableField(value = "diary")
    private String diary;
}