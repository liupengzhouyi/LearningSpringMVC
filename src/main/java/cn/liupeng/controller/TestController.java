package cn.liupeng.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class TestController {

    @RequestMapping(path = "/test")
    public String testSuccess() {
        System.out.println("项目搭建成功！");
        return "success";
    }
}
