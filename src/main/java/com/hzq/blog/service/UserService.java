package com.hzq.blog.service;

import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.hzq.blog.domain.User;
import com.hzq.blog.persistence.UserMapper;
import org.springframework.stereotype.Service;

/**
 * (User)表服务接口
 *
 * @author zhaowei.zhang01@hand-china.com
 * @since 2019-12-20 20:06:22
 */
@Service
public class UserService extends ServiceImpl<UserMapper,User> {


}