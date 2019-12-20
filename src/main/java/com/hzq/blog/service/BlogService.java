package com.hzq.blog.service;

import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.hzq.blog.domain.Blog;
import com.hzq.blog.persistence.BlogMapper;
import org.springframework.stereotype.Service;

/**
 * (Blog)表服务接口
 *
 * @author zhaowei.zhang01@hand-china.com
 * @since 2019-12-20 20:06:20
 */
@Service
public class BlogService extends ServiceImpl<BlogMapper,Blog> {


}