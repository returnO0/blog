package com.hzq.blog.domain;

import com.baomidou.mybatisplus.annotations.TableField;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

/**
 * @author zhiqiang.hu01@hand-china.com
 * @version 1.0
 * @date 2019-12-20 20:11
 **/
@Data
@NoArgsConstructor
@AllArgsConstructor
class Domain {
    @TableField(value = "id")
    protected String id;

    @TableField(value = "create_time")
    protected Date createTime;

    @TableField(value = "last_update_time")
    protected Date lastUpdateTime;
}
