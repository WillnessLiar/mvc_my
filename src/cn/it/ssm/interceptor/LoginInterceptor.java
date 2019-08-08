package cn.it.ssm.interceptor;


import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class LoginInterceptor implements HandlerInterceptor {
//    进入handler之前执行
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
//        获取请求的url
//        String url = request.getRequestURI();
////        判断URL是否是公开地址，实际使用将公开地址配置配置文件中,公开地址是登陆提交地址
//        if (url.indexOf("login")>=0){
////            如果进行登陆提交，放行
//            return true;
//        }
////        判断session
//        HttpSession session = request.getSession();
////        从session中取出用户信息
//        String username = (String) session.getAttribute("username");
//        if (username != null){
//            身份存在，放行
//            return true;
//        }
//        request.getRequestDispatcher("login").forward(request,response);

        return true;
    }
//    进入handler之后，返回modelAndView之前执行
    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {

    }
//    执行handler完成执行此方法
    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {

    }
}
