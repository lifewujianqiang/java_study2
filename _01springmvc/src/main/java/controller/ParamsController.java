package controller;

import com.sun.org.glassfish.gmbal.ParameterNames;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import javax.naming.Name;

/**
 * author:MarryCheck
 * create 2018-12-06 22:15
 * comment: RequestParam注解：表单和方法参数名称不一致；是否是必须参数；是否有默认值
 */
@Controller
@RequestMapping("/user")
public class ParamsController {
    @RequestMapping("/params01")
    // 解决参数名和表单名不一致的问题.默认是参数必须要有的，否则设置为required为false
    public ModelAndView getParam(@RequestParam(name="username") String p_username, @RequestParam(name = "age") int p_age) throws Exception{
        ModelAndView mv = new ModelAndView();
        mv.addObject("username",p_username);
        mv.addObject("age",p_age);
        mv.setViewName("result");
        return mv;

    }
}
