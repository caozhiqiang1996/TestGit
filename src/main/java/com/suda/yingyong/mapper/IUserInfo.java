package com.suda.yingyong.mapper;

import com.suda.yingyong.pojo.Accounts;
import com.suda.yingyong.pojo.Role;
import com.suda.yingyong.pojo.User;
import com.suda.yingyong.pojo.UserInfo;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.springframework.stereotype.Component;

import java.util.Date;
import java.util.List;

@Component
public interface IUserInfo {
    @Insert("insert into tb_userinfo (user_name,user_password,user_email,user_phone,user_create_time,user_enable_status) values (#{user_name},#{user_password},#{user_email},#{user_phone},#{user_create_time},#{user_enable_status}) ")
    void RegisterUserInfo(UserInfo userinfo);

    @Select("select * from tb_userinfo where user_name=#{user_name} ")
    UserInfo findByUserName(@Param("user_name") String user_name);


    @Select("select * from tb_userinfo where user_name=#{user_name} and user_password=#{user_password} ")
    UserInfo LoginUserInfo(@Param("user_name") String user_name, @Param("user_password") String user_password);


    @Update("update tb_userinfo set user_password=#{user_password} where user_name=#{user_name}")
    void Modify(@Param("user_password") String user_name, @Param("user_name") String user_pasaword);

    @Update("update tb_userinfo set user_email=#{user_email},user_phone=#{user_phone},user_wechat=#{user_wechat},user_tecent=#{user_tecent},user_job=#{user_job} where user_name=#{user_name}")
    void ModifyUserInfo(UserInfo userinfo);

    @Insert("insert into tb_userinfo (user_name,user_password,user_email,user_phone,user_wechat,user_tecent,user_job,user_create_time,user_enable_status) values (#{user_name},#{user_password},#{user_email},#{user_phone},#{user_wechat},#{user_tecent},#{user_job},#{user_create_time},#{user_enable_status}) ")
    void AddUserInfo(UserInfo userinfo);

    @Insert("insert tb_role (user_id,user_type) values(#{user_id},#{user_type})")
    void addRole(Role role);

    @Insert("insert tb_userinfo (user_password,user_phone,user_name,user_email,user_job)values" +
            "(#{user_password},#{user_phone}," +
            "#{user_name},#{user_email},#{user_job})")
    void addUser(User user);

    @Select("select * from tb_userinfo where user_phone=#{user_phone}")
    User selectUser(String user_phone);

    @Insert("insert tb_accounts (user_id,acc_remain,acc_total) values(#{user_id},#{acc_remain},#{acc_total})")
    void addAccount(Accounts accounts);
}
