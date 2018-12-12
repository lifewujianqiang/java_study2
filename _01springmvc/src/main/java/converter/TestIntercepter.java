package converter;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * author:MarryCheck
 * create 2018-12-12 21:54
 * comment: 测试拦截器 只拦截controller请求
 *
 * 过滤器和拦截器：
 *      过滤器可以过滤所有请求，包括jsp请求，范围更广
 *      拦截器只能拦截controller，
 *      其他功能基本相同
 *
 */
@Controller
public class TestIntercepter {
    @RequestMapping("/intercepter.do")
    public ModelAndView test() throws Exception{
        ModelAndView mv = new ModelAndView();
        System.out.println("test fun");
        mv.setViewName("intercepter");
        return mv;
    }
}
