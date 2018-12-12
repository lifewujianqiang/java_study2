package myexcption;

/**
 * author:MarryCheck
 * create 2018-12-11 22:06
 * comment: 自定义异常
 */

public class MyException extends Exception {
    public MyException(){
        super();
    }
    public MyException(String msg){
        super(msg);
    }


}
