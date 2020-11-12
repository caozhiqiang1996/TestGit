package com.suda.yingyong.controller;

import com.suda.yingyong.mapper.IUserMapper;
import com.suda.yingyong.pojo.Accounts;
import com.suda.yingyong.pojo.Bids;
import com.suda.yingyong.pojo.User;
import com.suda.yingyong.pojo.UserInfo;
import com.suda.yingyong.services.IBidsService;
import com.suda.yingyong.services.IChargeHistoryService;
import com.suda.yingyong.services.IUserInfoServise;
import com.suda.yingyong.services.impl.ChargeHistoryService;
import com.suda.yingyong.util.Verification;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;


import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

@Controller
@Component
public class HelloController {

    @Autowired
    IChargeHistoryService chargeHistoryService;
    @Autowired
    IUserInfoServise userInfoServise;
    @Autowired
    IUserInfoServise userService;
    @Autowired
    IBidsService bidsService;


    @RequestMapping("/hello")
    public String hello()
    {
//        chargeHistoryService.getUserPaymentHistoryByUserId(1);
        return "hello";
    }

    @RequestMapping("/homepage")
    public String homepage()
    {
        return "homepage";
    }

    @RequestMapping("/accountinfo")
    public String accountinfo()
    {
        return "accountinfo";
    }

    @RequestMapping("/useradd")
    public String useradd()
    {
        return "useradd";
    }

    @RequestMapping("/bidsearch")
    public String bidsearch()
    {
        return "bidsearch";
    }

    @RequestMapping("/focusbid")
    public String focusbid()
    {
        return "focusbid";
    }

    @RequestMapping("/forgetpassword")
    public String forgetpassword()
    {
        return "forgetpassword";
    }

    @RequestMapping("/income")
    public String income()
    {
        return "income";
    }

    @RequestMapping("/keywordmgr")
    public String keywordmgr()
    {
        return "keywordmgr";
    }

    @RequestMapping("/register")
    public String register()
    {
        return "register";
    }

    @RequestMapping("/userinfo")
    public String userinfo()
    {
        return "userinfo";
    }

    @RequestMapping("/userlist")
    public String userlist()
    {
        return "userlist";
    }

    @RequestMapping("/error")
    public String error()
    {
        return "error";
    }

    @RequestMapping("/afterlogin")
    public String afterlogin()
    {
        return "afterlogin";
    }


    @RequestMapping("/userinfochange")
    public String userinfochange(String user_name,String user_email,int user_phone,String user_wechat,String user_tecent,String user_job)
    {
        UserInfo userInfo = new UserInfo();
        userInfo.setUser_name(user_name);
        userInfo.setUser_email(user_email);
        userInfo.setUser_phone(user_phone);
        userInfo.setUser_wechat(user_wechat);
        userInfo.setUser_tecent(user_tecent);
        userInfo.setUser_job(user_job);
        userInfoServise.ModifyUserInfo(userInfo);
        return "userinfo";
    }

    //修改密码
    @RequestMapping("/modify")
    public String modify(String user_password,String user_name){

        if (userInfoServise.findByUserName(user_name) == null) {

            return "error";
        }else {
            userInfoServise.Modify(user_password,user_name);

            return "homepage";
        }
    }
//验证码
    @RequestMapping("/verification")
    public void verifyCodeImg(HttpServletRequest hsr,HttpServletResponse res) throws IOException {
        res.setHeader("content-type","image/jpg");
        String codeImage=Verification.createOneCodeImage( res.getOutputStream());
        hsr.getSession().setAttribute("codeImage",codeImage);
    }

    //登录
    @RequestMapping("/loginUser")
    public String afterlogin(ModelMap modelMap, HttpServletRequest hst, HttpServletResponse res) throws IOException {
        res.setCharacterEncoding("UTF-8");
        res.setContentType("text/html; charset=utf-8");
        PrintWriter out=res.getWriter();

        UserInfo userInfo=new UserInfo();
        userInfo.setUser_name(hst.getParameter("user_name"));
        userInfo.setUser_password( hst.getParameter("user_password"));
        String codeImage= (String) hst.getSession().getAttribute("codeImage");
        String code=hst.getParameter("code");

        System.out.println(hst.getParameter("user_name"));
        System.out.println(code);

            if(codeImage.equals(code.toUpperCase())){
                UserInfo userLogin=userInfoServise.LoginUserInfo(userInfo);
                if((userLogin )!=null){
                    hst.getSession().setAttribute("user_name",userLogin.getUser_name());
                    return "afterlogin";
                }else {
                    out.print("<script>alert('用户名或密码错误！');history.go(-1);</script>");
                }
            }else{
                out.print("<script>alert('验证码错误！');history.go(-1);</script>");

            }
            out.flush();
            out.close();
            return null;
        }



    //注册
    @RequestMapping("/reguser")
    public String reguser(String user_name,String user_password,String user_email,int user_phone) {
        UserInfo userInfo = new UserInfo();
        userInfo.setUser_name(user_name);
        userInfo.setUser_password(user_password);
        userInfo.setUser_email(user_email);
        userInfo.setUser_phone(user_phone);
        userInfo.setUser_create_time(new Date());
        userInfo.setUser_enable_status("1");
        // 如果数据库中没有该用户，可以注册，否则跳转页面
        if (userInfoServise.findByUserName(user_name) == null) {
//            // 添加用户
            userInfoServise.RegisterUserInfo(userInfo);
//            // 注册成功跳转到主页面
            return "homepage";
        }else {
//            // 注册失败跳转到错误页面
            return "error";
        }
    }

    //增加用户（管理员）
    @RequestMapping("/add_user")
    public String add_user(ModelMap modelMap,HttpServletRequest req,HttpServletResponse res) throws IOException {
        res.setCharacterEncoding("UTF-8");
        res.setContentType("text/html; charset=utf-8");
        PrintWriter out = res.getWriter();
        User user = new User();
        String name = req.getParameter("name");
        String phone = req.getParameter("phone");
        String job = req.getParameter("job");
        String qq = req.getParameter("qq");
        String email = req.getParameter("email");
        user.setUser_password("123456");
        user.setUser_phone(phone);
        user.setUser_email(email);
        user.setUser_name(name);
        user.setUser_job(job);
        if (userService.queryUser(phone) != null) {
            out.print("<script>alert('用户名已存在！');history.go(-1);</script>");
            out.flush();
            out.close();
            return null;

        } else {
            out.print("<script>alert('添加用户成功！(初始密码：123456)');history.go(-1);</script>");

        }
        out.flush();
        out.close();
        userService.addUser(user);
        return "userlist";

    }
    @RequestMapping("/Search")
    public String Search(String start_time,String end_time,HttpSession session) throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        Date start = sdf.parse(start_time);
        Date end = sdf.parse(end_time);
        List<Bids> bids = bidsService.SearchBids(start,end);
        session.setAttribute("bids", bids);
        return "bidsearch";
    }

}