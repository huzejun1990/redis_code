package com.dream;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: huzejun
 * @Date: 2021/3/20 18:44
 */
@RestController
public class WorldController {

    @RequestMapping("/w")
    public String wordDemo(){
        return "World";
    }

}
