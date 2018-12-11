package controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * author:MarryCheck
 * create 2018-12-05 21:11
 * comment: 使用注解方式
 */

@Controller
@RequestMapping("/test")
public class TestController02 {

    @RequestMapping(value = "/reqpost.do", method = RequestMethod.POST)  //只处理post请求的方法
    public ModelAndView reqpost(HttpServletRequest request, HttpServletResponse response) throws Exception {
        ModelAndView mv = new ModelAndView();
        mv.addObject("method","post demo ");
        mv.setViewName("post");
        return mv;
    }

    @RequestMapping(value = "/reqget.do", method = RequestMethod.GET)  //只处理post请求的方法
    public ModelAndView reqget(HttpServletRequest request, HttpServletResponse response) throws Exception {
        ModelAndView mv = new ModelAndView();
        mv.addObject("method","get demo ");
        mv.setViewName("get");
        return mv;
    }

}
