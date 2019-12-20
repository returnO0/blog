package com.hzq.blog.web;

import com.hzq.blog.domain.Label;
import com.hzq.blog.service.LabelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * (Label)表控制层
 *
 * @author zhaowei.zhang01@hand-china.com
 * @since 2019-12-20 20:06:21
 */
@RestController
@RequestMapping("/api/label")
public class LabelController {

    @Autowired
    private LabelService labelService;


}