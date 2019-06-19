package cn.liupeng.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpSession;

/**
 * @author liupeng
 */
@Controller
@RequestMapping(path = "/session")
public class SessionController {

    @RequestMapping(path = "/check")
    public ModelAndView check(HttpSession httpSession) {
        Integer integer = (Integer) httpSession.getAttribute("count");
        if (integer == null || integer.equals(null)) {
            integer = 0;
        }
        integer = integer + 1;
        httpSession.setAttribute("count", integer);
        ModelAndView modelAndView = new ModelAndView("check");
        return modelAndView;
    }

}
