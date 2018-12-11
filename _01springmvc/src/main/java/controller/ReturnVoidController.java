package controller;

import bean.Student;
import com.alibaba.fastjson.JSON;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.PrintWriter;

/**
 * author:MarryCheck
 * create 2018-12-10 22:32
 * comment:
 */

@Controller
public class ReturnVoidController {

    @RequestMapping("/ajaxResponse.do")
    public void returnVoid(HttpServletRequest request, HttpServletResponse response,Student student) throws Exception {
        PrintWriter out = response.getWriter();
        String jsonString = JSON.toJSONString(student);
        out.write(jsonString);

    }
}
