package controller;

import bean.User;
import org.springframework.beans.propertyeditors.FileEditor;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.validation.ObjectError;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

/**
 * author:MarryCheck
 * create 2018-12-12 21:11
 * comment: 后台数据校验controller
 */

@Controller
public class UserController {
    //@Validated 不能加载string和基本数据类型的前面
    // BindingResult 可以获取所有验证异常的信息
    @RequestMapping("/user.do")
    public ModelAndView userValidate(@Validated User user, BindingResult br) throws Exception{
        ModelAndView mv = new ModelAndView();
        List<ObjectError> allErrors = br.getAllErrors();
        if (allErrors != null && allErrors.size() != 0){
            FieldError nameError = br.getFieldError("name");
            FieldError ageError = br.getFieldError("age");

            if (nameError != null){
                mv.addObject("nameError",nameError.getDefaultMessage());
            }else if (ageError != null){
                mv.addObject("ageError",ageError.getDefaultMessage());
            }
            return mv;
        }
        mv.setViewName("/success");
        return mv;
    }
}
