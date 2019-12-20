package com.hzq.blog.web;

import com.hzq.blog.domain.Message;
import com.hzq.blog.service.MessageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * (Message)表控制层
 *
 * @author zhaowei.zhang01@hand-china.com
 * @since 2019-12-20 20:06:22
 */
@RestController
@RequestMapping("/api/message")
public class MessageController {

    @Autowired
    private MessageService messageService;


}