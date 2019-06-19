package cn.liupeng.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @author liupeng
 */
@Controller
public class Index01Controller {

    @RequestMapping("/index01")
    public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) {
        System.out.println("注解方式视图定位");
        ModelAndView modelAndView = new ModelAndView("index01");
        modelAndView.addObject("msg", "This is a Msg");
        return modelAndView;
    }
}
