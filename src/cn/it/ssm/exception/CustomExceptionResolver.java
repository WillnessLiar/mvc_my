package cn.it.ssm.exception;

import org.springframework.web.servlet.HandlerExceptionResolver;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//异常处理器
public class CustomExceptionResolver implements HandlerExceptionResolver {


    @Override
    public ModelAndView resolveException(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) {
//       解析异常类型,如果是系统自定义异常，直接取出异常信息，在错误页面显示
//        String message=null;
//        if (ex instanceof CustomException){
//            message=((CustomException)ex).getMessage();
//        }else {
////            如果不是系统自定义异常，构造一个自定义的异常类型（“未知错误”）
//            message="未知错误";
//        }

        CustomException customException = null;
        if (ex instanceof CustomException){
            customException=((CustomException)ex);
        }else {
            customException = new CustomException("未知错误");
        }
        String message = customException.getMessage();
        ModelAndView modelAndView = new ModelAndView();
//        将错误信息传到页面
        modelAndView.addObject("message",message);
        modelAndView.setViewName("items/error");
        return modelAndView;
    }
}
