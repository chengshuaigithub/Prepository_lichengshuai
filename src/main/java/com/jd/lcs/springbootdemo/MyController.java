package com.jd.lcs.springbootdemo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * description:
 * Created by lichengshuai on 2019/3/18.
 */
@RestController
@RequestMapping("/demo")
public class MyController {

    @RequestMapping("/thing")
    public String thing() {
        return "success";
    }

}
