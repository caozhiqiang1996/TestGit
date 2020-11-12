package com.suda.yingyong.services.impl;

import com.suda.yingyong.mapper.IUserInfo;
import com.suda.yingyong.pojo.Accounts;
import com.suda.yingyong.pojo.Role;
import com.suda.yingyong.pojo.User;
import com.suda.yingyong.pojo.UserInfo;
import com.suda.yingyong.services.IUserInfoServise;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@Component
public class UserInfoServise implements IUserInfoServise{
    @Autowired
    IUserInfo iUserInfo;

    @Override
    public void RegisterUserInfo(UserInfo userInfo) {
//        iUserInfo.Login(userInfo.getUser_name(),userInfo.getUser_password(),userInfo.getUser_email(),userInfo.getUser_phone(),userInfo.getUser_wechat(),userInfo.getUser_tecent(),userInfo.getUser_job(),userInfo.getUser_create_time(),userInfo.getUser_enable_status());
        iUserInfo.RegisterUserInfo(userInfo);
    }

    @Override
    public UserInfo findByUserName(String userName) {
        return iUserInfo.findByUserName(userName);
    }

    @Override
    public UserInfo LoginUserInfo(UserInfo userInfo) {
        UserInfo userSelect=iUserInfo.findByUserName(userInfo.getUser_name());
        if(userSelect!=null){
            if(userSelect.getUser_password().equals(userInfo.getUser_password())){
                return userSelect;
            }
        }
        return null;
    }

    @Override
    public User queryUser(String phone) {
        User user=iUserInfo.selectUser(phone);
        return user;
    }

    @Override
    public Boolean addUser(User user) {
        if(iUserInfo.findByUserName(user.getUser_name())==null){
            iUserInfo.addUser(user);
            User user1=iUserInfo.selectUser(user.getUser_phone());
            Accounts account=new Accounts(user1.getUser_id(),0,0);
            iUserInfo.addAccount(account);
            Role role=new Role();
            role.setUser_id(user1.getUser_id());
            role.setRole_desc("free");
            iUserInfo.addRole(role);
            return true;
        }
        return false;
    }


    @Override
    public void Modify(String userName, String userPassword) {
        iUserInfo.Modify(userName,userPassword);
    }

    @Override
    public void ModifyUserInfo(UserInfo userInfo) {
        iUserInfo.ModifyUserInfo(userInfo);
    }

    @Override
    public void AddUserInfo(UserInfo userInfo) {
        iUserInfo.AddUserInfo(userInfo);
    }
}
