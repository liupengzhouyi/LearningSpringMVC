package cn.liupeng.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping(path = "/jump")
public class jumpController {

    @RequestMapping(path = "/jumpTo")
    public ModelAndView jump() {
        ModelAndView modelAndView = new ModelAndView("redirect:/index01");
        System.out.println("--------------start------------");
        System.out.println("页面开始跳转");
        System.out.println("我的位置" + "cn.liupeng.controller.jumpController");
        System.out.println("跳转位置: " + "index");
        System.out.println("---------------end-------------");
        return modelAndView;
    }
}
