package com.ps.blog.controller;

import com.ps.blog.service.ISysLogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *@ClassName SysController
 *@Description TODO
 *@Author PS
 *@Date 2018/9/5 10:41
 **/
@RestController
@RequestMapping("/admin")
public class SysController {

    @Autowired
    private ISysLogService iSysLogService;

}
