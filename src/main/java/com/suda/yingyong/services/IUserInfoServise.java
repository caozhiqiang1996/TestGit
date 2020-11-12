package com.suda.yingyong.services;

import com.suda.yingyong.pojo.Accounts;
import com.suda.yingyong.pojo.User;
import com.suda.yingyong.pojo.UserInfo;

import java.util.List;

public interface IUserInfoServise {
    public void RegisterUserInfo(UserInfo userInfo);
    //根据用户名查询
    UserInfo findByUserName(String userName);

    UserInfo LoginUserInfo(UserInfo userInfo);
    public User queryUser(String phone);
    public Boolean addUser(User user);


    void Modify(String userName,String userPassword);

    void ModifyUserInfo(UserInfo userInfo);

    void AddUserInfo(UserInfo userInfo);
}
