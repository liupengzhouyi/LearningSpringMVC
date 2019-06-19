package cn.liupeng.controller;

import cn.liupeng.pojo.Product;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping(path = "/product")
public class getProductController {

    @RequestMapping("/showProduct")
    public ModelAndView getProduct(Product product) {
        ModelAndView modelAndView = new ModelAndView("showProduct");
        System.out.println(product.toString());
        return modelAndView;
    }
}
