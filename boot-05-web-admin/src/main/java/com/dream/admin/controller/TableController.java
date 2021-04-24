package com.dream.admin.controller;

import com.dream.admin.bean.User;
import com.dream.admin.exception.UserTooManyException;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Arrays;
import java.util.List;

/**
 * @Author: huzejun
 * @Date: 2021/4/4 17:27
 */
@Controller
public class TableController {

    /**
     *
     * @param a 不带请求参数，或者参数类型不对 400 Bad Request 一般都是浏览器的参数没有传递正确
     * @return
     */
    @GetMapping("/basic_table")
    public String basic_table(@RequestParam("a") int a){

        int i = 10/0;
        return "table/basic_table";
    }

    @GetMapping("/dynamic_table")
    public String dynamic_table(Model model){
        //表格内容的遍历
        List<User> users = Arrays.asList(new User("zhangsan", "123456"),
                new User("lisi", "123444"),
                new User("haha", "aaa"),
                new User("hehe", "aaadddd"));

        if ((users.size()>3)){
            throw new UserTooManyException();
        }

        model.addAttribute("users",users);

        return "table/dynamic_table";
    }

    @GetMapping("/responsive_table")
    public String responsive_table(){
        return "table/responsive_table";
    }

    @GetMapping("/editable_table")
    public String editable_table(){
        return "/table/editable_table";
    }
}
