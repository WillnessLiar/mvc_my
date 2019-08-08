//package cn.it.ssm.controller;
//
//import org.springframework.stereotype.Controller;
//import org.springframework.web.bind.annotation.RequestMapping;
//
//import javax.servlet.http.HttpSession;
//
//@Controller
//public class LoginController {
//
//    //    登录
//    @RequestMapping("/login")
//    public String login(HttpSession session, String username, String password) throws Exception {
//
////            调用service进行用户身份验证
//
//
////            在session中保存用户信息
//        session.setAttribute("username", username);
//        return "redirect:Comm/queryComm";
//    }
//
//    //    退出
//    @RequestMapping("/logout")
//    public String logout(HttpSession session) throws Exception {
//        session.invalidate();
//        return "redirect:Comm/queryComm";
//    }
//
//}
