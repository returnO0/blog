package com.hzq.blog.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author zhiqiang.hu01@hand-china.com
 * @version 1.0
 * @date 2019-12-21 10:08
 **/
@Controller
@RequestMapping(value = "/to")
public class JumpController {
    @GetMapping("/article")
    public String article(){
        return "article";
    }
    @GetMapping("/diary")
    public String diary(){
        return "diary";
    }
    @GetMapping("/message")
    public String message(){
        return "message";
    }
    @GetMapping("/link")
    public String link(){
        return "link";
    }
    @GetMapping("/read")
    public String read(){
        return "read";
    }
}
