package controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * author:MarryCheck
 * create 2018-12-05 21:11
 * comment: 使用注解方式
 */

@Controller
@RequestMapping("/test") // 表示一个命名空间，request重复的部分
public class TestController  {

    @RequestMapping("/test01.do")
    public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception {
        ModelAndView mv = new ModelAndView();
        mv.addObject("hello1","this is test ");
        mv.setViewName("test01"); // 页面资源名称

        return mv;
    }
    @RequestMapping({"/hello.do","/world.do"})
    public ModelAndView test(HttpServletRequest request, HttpServletResponse response) throws Exception {
        ModelAndView mv = new ModelAndView();
        mv.addObject("hello1","this is test ");
        mv.setViewName("test01");

        return mv;
    }
}
