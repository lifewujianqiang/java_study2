package myexcption;

import org.springframework.web.servlet.HandlerExceptionResolver;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * author:MarryCheck
 * create 2018-12-11 22:33
 * comment: 自定义异常处理方法,只要出现的异常，就执行这个方法
 */

public class myExceptionResolver implements HandlerExceptionResolver {
    @Override
    public ModelAndView resolveException(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) {
        ModelAndView mv = new ModelAndView();
        mv.addObject("ex",ex);
        if (ex instanceof MyException){
            // 记录日志，跳转页面等等操作
            mv.setViewName("error/error");
        }else if (ex instanceof NullPointerException){
            // 记录日志，跳转页面等等操作
            //...
        }

        return mv;
    }
}
