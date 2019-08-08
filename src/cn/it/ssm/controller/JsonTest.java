package cn.it.ssm.controller;

import cn.it.ssm.po.CommCustom;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.Random;

//@RestController
@Controller
public class JsonTest {

//        请求json，输出响应json(商品信息)
    //@RequestBody将请求商品信息的json串转成commcustom对象，ResponseBody将commcustom转成json输出
    @PostMapping(value="/requestJson",consumes = "application/json")
    public @ResponseBody CommCustom requestJson(@RequestBody CommCustom commCustom){
        System.out.println(commCustom.toString());
        return commCustom;
    }
//
    @RequestMapping("/responseJson")
    public @ResponseBody CommCustom responseJson(CommCustom commCustom){
        return commCustom;
    }



}
