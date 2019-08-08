package cn.it.ssm.controller;

import cn.it.ssm.controller.validation.ValidGroup1;
import cn.it.ssm.exception.CustomException;
import cn.it.ssm.po.CommCustom;
import cn.it.ssm.po.ListQueryVo;
import cn.it.ssm.service.CommService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

@Controller
//为了方面URL进行分类管理，可以定义一个根路径，最终访问根+子路径
@RequestMapping("Comm")
public class CommController {

    @Autowired
    private CommService commService;

//    商品分类
//    @ModelAttribute("itemsTypes")
//    public Map<String,String>get(){
//        Map<String,String>itemsTypes = new HashMap<String, String>();
//        itemsTypes.put("101","好东西");
//        itemsTypes.put("202","坏东西");
//        return itemsTypes;
//    }

    //      商品查询
    //    一般将方法名和url写成一样
    @RequestMapping("/queryComm")
    public ModelAndView queryComm(HttpServletRequest request, ListQueryVo listQueryVo) throws Exception {
        System.out.println(request.getParameter("id"));
        //      调用service查找数据库，查询商品列表
        List<CommCustom> commList = commService.findComm(null);
        //        返回modelandview
        ModelAndView modelAndView = new ModelAndView();
        //相当与request的setattribute
        modelAndView.addObject("commList", commList);
        //    指定视图
        modelAndView.setViewName("items/CommList");
        return modelAndView;
    }



    //    批量删除
    @RequestMapping("/deleteComm")
    public String deleteComm(Integer[] comm_id) throws Exception {
//        调用service删除商品
        return "items/success";
    }



    @RequestMapping(value = "/editComm", method = {RequestMethod.POST, RequestMethod.GET})
//         requestparam指定request传入参数与形参绑定,required指定参数是否必须传入
    public String editComm(Model model, @RequestParam(value = "comm_id", required = true, defaultValue = "1") Integer Idd) throws Exception {
        //        调用service查询商品信息，根据id查询
            CommCustom commCustom = commService.findCommById(Idd);
//            if (commCustom == null) {
//                throw new CustomException("修改的商品信息不存在！");
//            }

            //    通过形参中的model将model数据转到页面
            model.addAttribute("commCustom", commCustom);
            return "items/editComm";
        }




    //    商品信息修改提交
//    在需要校验的pojo前+validated，在后面+bindingrseult接受校验
    @RequestMapping(value = "editCommSubmit", method = RequestMethod.POST)
    public String editCommSubmit(Model model,
                                 @Validated(value = {ValidGroup1.class}) CommCustom commCustom,
                                 BindingResult bindingResult,
                                 MultipartFile comm_pic) throws Exception {
        System.out.println(commCustom.toString());
//        获取校验信息
        if (bindingResult.hasErrors()){
//            输出错误信息
            List<ObjectError> allErrors = bindingResult.getAllErrors();
            for (ObjectError objectError:allErrors){
                System.out.println(objectError.getDefaultMessage());
            }
//            将错误信息转到页面
            model.addAttribute("allErrors",allErrors);
            return "items/editComm";
        }
        ////            原始名称
//            String originalFilename = comm_pic.getOriginalFilename();
//        上传图片
//        if (comm_pic!=null && originalFilename!=null &&) originalFilename.length()>0{
////            存储图片的物理位置
//            String pic_path="F:\\work\\images\\";
////            新的图片名称
//            String newfilename = UUID.randomUUID() + originalFilename.substring(originalFilename.lastIndexOf("."));
////            新图片
//            File newfile = new File(pic_path+newfilename);
////            将内存中的数据写入磁盘
//            comm_pic.transferTo(newfile);
////            将新的图片名称写入属性
//            commCustom.setPic(newfilename);
//
//        }

//        调用service更新商品信息,页面需要将商品信息传到此方法
        commService.updateCommList(commCustom.getComm_id(), commCustom);
        //重定向到商品查询列表
        return "redirect:queryComm";
//     页面转发,forward的request可以共享，redirect不行
//        return "forward:queryComm";
//        return "items/success";
    }



    //    批量修改商品信息，将商品信息查询出来，在页面中编辑商品信息
    //      商品查询
    //    一般将方法名和url写成一样
    @RequestMapping("/editCommQuery")
    public ModelAndView editCommQuery(HttpServletRequest request, ListQueryVo listQueryVo) throws Exception {
        //      调用service查找数据库，查询商品列表
        List<CommCustom> commList = commService.findComm(null);

        //        返回modelandview
        ModelAndView modelAndView = new ModelAndView();
        //相当与request的setattribute
        modelAndView.addObject("commList", commList);
        //    指定视图
        modelAndView.setViewName("items/editCommQuery");
        return modelAndView;
    }


//    查询商品信息，输出json
//    commView里的id表示将这个位置参数传到@PathVariable指定名称中
    @RequestMapping("/commView/{comm_id}")
    public @ResponseBody CommCustom commView(@PathVariable("comm_id") Integer comm_id)throws Exception{
//        调用service
        CommCustom commCustom = commService.findCommById(comm_id);

        return commCustom;
    }


    //    批量修改商品提交
//        通过ListQueryVo接受信息，并存储到commCustomList中
    @RequestMapping("/editCommAllSubmit")
    public String editCommAllSubmit(ListQueryVo listQueryVo) throws Exception {

        return "items/success";

    }

}





