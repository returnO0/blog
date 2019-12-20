package com.hzq.blog.web;

import com.hzq.blog.domain.Comments;
import com.hzq.blog.service.CommentsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * (Comments)表控制层
 *
 * @author zhaowei.zhang01@hand-china.com
 * @since 2019-12-20 20:06:21
 */
@RestController
@RequestMapping("/api/comments")
public class CommentsController {

    @Autowired
    private CommentsService commentsService;


}