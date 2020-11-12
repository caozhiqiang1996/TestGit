package com.suda.yingyong.pojo;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import java.sql.Date;
import java.util.List;

@Component
@Repository

public class User {
    private int user_id;
    private  String user_name;
    private String user_password;
    private String user_phone;
    private String user_email;
    private String user_openxid;
    private String user_idcard;
    private String user_icon_url;
    private String user_job;

    public String getUser_job() {
        return user_job;
    }

    public void setUser_job(String user_job) {
        this.user_job = user_job;
    }

    public String getUser_password() {
        return user_password;
    }

    public void setUser_password(String user_password) {
        this.user_password = user_password;
    }

    public String getUser_phone() {
        return user_phone;
    }

    public void setUser_phone(String user_phone) {
        this.user_phone = user_phone;
    }

    public List<ChargeHistory> getChList() {
        return chList;
    }

    public void setChList(List<ChargeHistory> chList) {
        this.chList = chList;
    }

    private List<ChargeHistory> chList;
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

    public String getUser_email() {
        return user_email;
    }

    public void setUser_email(String user_email) {
        this.user_email = user_email;
    }

    public String getUser_openxid() {
        return user_openxid;
    }

    public void setUser_openxid(String user_openxid) {
        this.user_openxid = user_openxid;
    }

    public String getUser_idcard() {
        return user_idcard;
    }

    public void setUser_idcard(String user_idcard) {
        this.user_idcard = user_idcard;
    }

    public String getUser_icon_url() {
        return user_icon_url;
    }

    public void setUser_icon_url(String user_icon_url) {
        this.user_icon_url = user_icon_url;
    }

    public Date getCreate_dt() {
        return create_dt;
    }

    public void setCreate_dt(Date create_dt) {
        this.create_dt = create_dt;
    }

    public Date getUpdate_dt() {
        return update_dt;
    }

    public void setUpdate_dt(Date update_dt) {
        this.update_dt = update_dt;
    }

    public String getIs_observe() {
        return is_observe;
    }

    public void setIs_observe(String is_observe) {
        this.is_observe = is_observe;
    }

    private Date create_dt;
    private Date update_dt;
    private String is_observe;


}
