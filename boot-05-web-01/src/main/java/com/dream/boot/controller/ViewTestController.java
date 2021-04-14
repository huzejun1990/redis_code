package com.dream.boot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @Author: huzejun
 * @Date: 2021/4/4 13:52
 */
@Controller
public class ViewTestController {

    @GetMapping("/dream")
    public String dream(Model model){
        //model中的数据会被放在请求域中 request.setAttribute("a",aa);
        model.addAttribute("msg","你发，dream");
        model.addAttribute("link","http://www.baidu.com");
        return "success";
    }

}
