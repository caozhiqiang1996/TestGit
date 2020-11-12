package com.suda;

import com.suda.yingyong.pojo.UserInfo;
import com.suda.yingyong.services.impl.ChargeHistoryService;
import com.suda.yingyong.services.impl.UserInfoServise;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class test {
    @Test
    public void testSpringStartup(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
//        applicationContext.getBean("iChargeHistory");
        UserInfoServise uis = (UserInfoServise) applicationContext.getBean("userInfoServise");
        UserInfo userInfo = new UserInfo();
        userInfo.setUser_name("a");
        userInfo.setUser_password("123456");
        userInfo.setUser_email("aaa@ddd");
        userInfo.setUser_create_time(new Date());
        userInfo.setUser_enable_status("1");
        userInfo.setUser_job("asdd");
        userInfo.setUser_phone(1325469897);
        userInfo.setUser_tecent("48964645654");
        userInfo.setUser_wechat("5sf6d5sdf5");
//        List list =new ArrayList<UserInfo>();
//        list.add(userInfo);
        uis.RegisterUserInfo(userInfo);
//        assert (applicationContext !=null);
    }
}
