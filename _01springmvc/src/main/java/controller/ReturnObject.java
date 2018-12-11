package controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * author:MarryCheck
 * create 2018-12-10 23:12
 * comment:返回object对象
 */

@Controller
public class ReturnObject {
    @RequestMapping(name = "/returnObject.do" ,produces = "text/html;charset=utf-8") // 中文乱码
    @ResponseBody //将返回的字符串添加到响应体body中去
    public Object returnObject() throws Exception{

        // return "jack1024";
        return "杰克1024";
    }
}
