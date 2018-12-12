package bean;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

/**
 * author:MarryCheck
 * create 2018-12-12 21:07
 * comment: hibernate 数据校验,后台校验
 */

public class User {

    @NotEmpty(message = "姓名不能为空")
    @Size(min = 4,max = 20,message = "姓名长度必须在{min}-{max}之间")
    private String name;
    @Min(value = 0,message = "年龄必须大于{value}岁")
    @Max(value = 130,message = "年龄必须小于{value}岁")
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
