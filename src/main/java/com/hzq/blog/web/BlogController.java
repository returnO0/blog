package com.hzq.blog.web;

import com.hzq.blog.domain.Blog;
import com.hzq.blog.service.BlogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * (Blog)表控制层
 *
 * @author zhaowei.zhang01@hand-china.com
 * @since 2019-12-20 20:06:20
 */
@RestController
@RequestMapping("/api/blog")
public class BlogController {

    @Autowired
    private BlogService blogService;


}