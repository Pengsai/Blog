package com.ps.blog.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

/**
 * @ClassName BackController
 * @Description TODO
 * @Author PS
 * @Date 2018/9/5 10:09
 **/
@Controller
@RequestMapping("/admin")
public class BackController {

    @RequestMapping("/index")
    public String index() {
        return "index.html";
    }

}
