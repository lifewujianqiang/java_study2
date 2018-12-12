package controller;

import myexcption.MyException;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * author:MarryCheck
 * create 2018-12-11 22:07
 * comment:自定义异常练习
 */


@Controller
public class MyExceptionController {

    @RequestMapping("/myexception.do")
    public ModelAndView myException(String name) throws Exception {

        ModelAndView mv = new ModelAndView();
        if (name.equalsIgnoreCase("jack")) {
            throw new MyException("New MyException...");
        }
        //还不能直接使用else
        if (!name.equalsIgnoreCase("jack")) {
            throw new Exception("Exception");
        }
        return mv;
    }


}
