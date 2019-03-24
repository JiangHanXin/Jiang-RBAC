package com.xiaojiang.controller;

import com.sun.corba.se.spi.ior.ObjectKey;
import com.xiaojiang.entity.PostUserParameter;
import com.xiaojiang.service.QueryUserService;
import com.xiaojiang.serviceImpl.QueryUserServiceImpl;
import net.sf.json.JSONObject;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

@Controller
public class TestController {

    @Autowired
    private QueryUserService userService = null;

    @RequestMapping(value = "/index")
    public String index(){
        return "index";
    }

    /**
     *@描述  跳转登录界面
     *@参数  null
     *@返回值 login
     *@创建人 小江
     *@创建时间 2019/2/27
     *@修改人和其它信息
     */
    @RequestMapping(value = "/login")
    public String login(){
        return "login";
    }


    /**
     *@描述   登录验证
     *@参数    postUserParameter POST数据
     *@返回值  successMap 登录结果
     *@创建人 小江
     *@创建时间 2019/2/27 0027
     *@修改人和其它信息
     */
    //登录验证
    @RequestMapping(value = "/sso/login",method = RequestMethod.GET)
    @ResponseBody
    public Map<String,Object> dologin(PostUserParameter postUserParameter){
        PostUserParameter dbUser = userService.queryByUser(postUserParameter);
        Map<String,Object> successMap = new HashMap<>();
        if(dbUser != null){
            successMap.put("loginstatu","success");
        }else{
            successMap.put("loginstatu","fail");
        }
        return successMap;
    }


    @RequestMapping(value = "/signout")
    public String signOut(){
        // forward:index.html  转发
        //redirct 重定向
        return "redirect:login";
    }


    @RequestMapping(value = "/json")
    @ResponseBody
    public Object json(){
        Map map = new HashMap();
        map.put("username","xiaojiang");
        map.put("password","root");
        return map;
    }


}
