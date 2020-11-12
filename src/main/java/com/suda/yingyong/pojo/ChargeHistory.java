package com.suda.yingyong.pojo;

import org.springframework.stereotype.Component;

import java.sql.Date;

@Component
public class ChargeHistory {

    private int ch_id;
    private int  user_id;
    private int charge_amount;
    private String  charge_type;
    private String     charge_method;
    private Date charge_date;
    private String        charge_remarks;
    private String        charge_from;
    private String       harge_to;
    private String        charge_billno;
    private User  user;

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public int getCh_id() {
        return ch_id;
    }

    public void setCh_id(int ch_id) {
        this.ch_id = ch_id;
    }

    public int getUser_id() {
        return user_id;
    }

    public void setUser_id(int user_id) {
        this.user_id = user_id;
    }

    public int getCharge_amount() {
        return charge_amount;
    }

    public void setCharge_amount(int charge_amount) {
        this.charge_amount = charge_amount;
    }

    public String getCharge_type() {
        return charge_type;
    }

    public void setCharge_type(String charge_type) {
        this.charge_type = charge_type;
    }

    public String getCharge_method() {
        return charge_method;
    }

    public void setCharge_method(String charge_method) {
        this.charge_method = charge_method;
    }

    public Date getCharge_date() {
        return charge_date;
    }

    public void setCharge_date(Date charge_date) {
        this.charge_date = charge_date;
    }

    public String getCharge_remarks() {
        return charge_remarks;
    }

    public void setCharge_remarks(String charge_remarks) {
        this.charge_remarks = charge_remarks;
    }

    public String getCharge_from() {
        return charge_from;
    }

    public void setCharge_from(String charge_from) {
        this.charge_from = charge_from;
    }

    public String getHarge_to() {
        return harge_to;
    }

    public void setHarge_to(String harge_to) {
        this.harge_to = harge_to;
    }

    public String getCharge_billno() {
        return charge_billno;
    }

    public void setCharge_billno(String charge_billno) {
        this.charge_billno = charge_billno;
    }


}
