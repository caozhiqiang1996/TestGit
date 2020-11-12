package com.suda.yingyong.pojo;

import java.util.Date;

public class Bid {
    private int bid_id;
    private int user_id;
    private String bid_brief;
    private String bid_detail;
    private String bid_link;
    private Date bid_create_time;
    private String bid_operation;

    public int getBid_id() {
        return bid_id;
    }

    public void setBid_id(int bid_id) {
        this.bid_id = bid_id;
    }

    public int getUser_id() {
        return user_id;
    }

    public void setUser_id(int user_id) {
        this.user_id = user_id;
    }

    public String getBid_brief() {
        return bid_brief;
    }

    public void setBid_brief(String bid_brief) {
        this.bid_brief = bid_brief;
    }

    public String getBid_detail() {
        return bid_detail;
    }

    public void setBid_detail(String bid_detail) {
        this.bid_detail = bid_detail;
    }

    public String getBid_link() {
        return bid_link;
    }

    public void setBid_link(String bid_link) {
        this.bid_link = bid_link;
    }

    public Date getBid_create_time() {
        return bid_create_time;
    }

    public void setBid_create_time(Date bid_create_time) {
        this.bid_create_time = bid_create_time;
    }

    public String getBid_operation() {
        return bid_operation;
    }

    public void setBid_operation(String bid_operation) {
        this.bid_operation = bid_operation;
    }

    @Override
    public String toString() {
        return "Bid{" +
                "bid_id=" + bid_id +
                ", user_id=" + user_id +
                ", bid_brief='" + bid_brief + '\'' +
                ", bid_detail='" + bid_detail + '\'' +
                ", bid_link='" + bid_link + '\'' +
                ", bid_create_time=" + bid_create_time +
                ", bid_operation='" + bid_operation + '\'' +
                '}';
    }

    public Bid() {
    }

    public Bid(int bid_id, int user_id, String bid_brief, String bid_detail, String bid_link, Date bid_create_time, String bid_operation) {
        this.bid_id = bid_id;
        this.user_id = user_id;
        this.bid_brief = bid_brief;
        this.bid_detail = bid_detail;
        this.bid_link = bid_link;
        this.bid_create_time = bid_create_time;
        this.bid_operation = bid_operation;
    }
}
