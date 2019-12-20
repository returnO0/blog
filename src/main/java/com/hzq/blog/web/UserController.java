package com.hzq.blog.web;

import com.hzq.blog.domain.User;
import com.hzq.blog.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * (User)表控制层
 *
 * @author zhaowei.zhang01@hand-china.com
 * @since 2019-12-20 20:06:22
 */
@RestController
@RequestMapping("/api/user")
public class UserController {

    @Autowired
    private UserService userService;


}