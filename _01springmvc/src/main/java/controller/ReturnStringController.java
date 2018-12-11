package controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * author:MarryCheck
 * create 2018-12-10 21:46
 * comment: 返回 'jsp'
 * 返回string类型的controller，自动查找jsp文件
 * 如果希望方法执行完后，跳转到jsp页面，可以返回string类型
 */


@Controller
public class ReturnStringController {
    @RequestMapping("/welcome.do")
    public String welcome() throws  Exception{

        return "welcome";
    }
    @RequestMapping("external.do")
    public String external() throws  Exception{

        return "external";
    }
}
