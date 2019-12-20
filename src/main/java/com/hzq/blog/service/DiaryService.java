package com.hzq.blog.service;

import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.hzq.blog.domain.Diary;
import com.hzq.blog.persistence.DiaryMapper;
import org.springframework.stereotype.Service;

/**
 * (Diary)表服务接口
 *
 * @author zhaowei.zhang01@hand-china.com
 * @since 2019-12-20 20:06:21
 */
@Service
public class DiaryService extends ServiceImpl<DiaryMapper,Diary> {


}