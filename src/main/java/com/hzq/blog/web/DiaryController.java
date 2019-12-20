package com.hzq.blog.web;

import com.hzq.blog.domain.Diary;
import com.hzq.blog.service.DiaryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * (Diary)表控制层
 *
 * @author zhaowei.zhang01@hand-china.com
 * @since 2019-12-20 20:06:21
 */
@RestController
@RequestMapping("/api/diary")
public class DiaryController {

    @Autowired
    private DiaryService diaryService;


}