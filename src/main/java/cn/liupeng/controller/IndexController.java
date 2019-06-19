package cn.liupeng.controller;


        import org.springframework.web.servlet.ModelAndView;
        import org.springframework.web.servlet.mvc.Controller;

        import javax.servlet.http.HttpServletRequest;
        import javax.servlet.http.HttpServletResponse;

public class IndexController implements Controller {

    @Override
    public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception {
        ModelAndView modelAndView = new ModelAndView("index");
        modelAndView.addObject("message", "Hello Spring MVC");
        return modelAndView;
    }
}
