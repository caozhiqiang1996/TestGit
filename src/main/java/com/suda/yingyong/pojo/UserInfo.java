package com.suda.yingyong.pojo;

import java.util.Date;

public class UserInfo {
    private int user_id;
    private String user_name;
    private String user_password;
    private String user_email;
    private int user_phone;
    private String user_wechat;
    private String user_tecent;
    private String user_job;
    private Date user_create_time;
    private String user_enable_status;

    public UserInfo(int user_id, String user_name, String user_password, String user_email, int user_phone, String user_wechat, String user_tecent, String user_job, Date user_create_time, String user_enable_status) {
        this.user_id = user_id;
        this.user_name = user_name;
        this.user_password = user_password;
        this.user_email = user_email;
        this.user_phone = user_phone;
        this.user_wechat = user_wechat;
        this.user_tecent = user_tecent;
        this.user_job = user_job;
        this.user_create_time = user_create_time;
        this.user_enable_status = user_enable_status;
    }

    public UserInfo() {
    }

    @Override
    public String toString() {
        return "UserInfo{" +
                "user_id=" + user_id +
                ", user_name='" + user_name + '\'' +
                ", user_password='" + user_password + '\'' +
                ", user_email='" + user_email + '\'' +
                ", user_phone=" + user_phone +
                ", user_wechat='" + user_wechat + '\'' +
                ", user_tecent='" + user_tecent + '\'' +
                ", user_job='" + user_job + '\'' +
                ", user_create_time=" + user_create_time +
                ", user_enable_status='" + user_enable_status + '\'' +
                '}';
    }

    public int getUser_phone() {
        return user_phone;
    }

    public void setUser_phone(int user_phone) {
        this.user_phone = user_phone;
    }

    public Date getUser_create_time() {
        return user_create_time;
    }

    public void setUser_create_time(Date user_create_time) {
        this.user_create_time = user_create_time;
    }

    public int getUser_id() {
        return user_id;
    }

    public void setUser_id(int user_id) {
        this.user_id = user_id;
    }

    public String getUser_name() {
        return user_name;
    }

    public void setUser_name(String user_name) {
        this.user_name = user_name;
    }

    public String getUser_password() {
        return user_password;
    }

    public void setUser_password(String user_password) {
        this.user_password = user_password;
    }

    public String getUser_email() {
        return user_email;
    }

    public void setUser_email(String user_email) {
        this.user_email = user_email;
    }

    public String getUser_wechat() {
        return user_wechat;
    }

    public void setUser_wechat(String user_wechat) {
        this.user_wechat = user_wechat;
    }

    public String getUser_tecent() {
        return user_tecent;
    }

    public void setUser_tecent(String user_tecent) {
        this.user_tecent = user_tecent;
    }

    public String getUser_job() {
        return user_job;
    }

    public void setUser_job(String user_job) {
        this.user_job = user_job;
    }

    public String getUser_enable_status() {
        return user_enable_status;
    }

    public void setUser_enable_status(String user_enable_status) {
        this.user_enable_status = user_enable_status;
    }
}
