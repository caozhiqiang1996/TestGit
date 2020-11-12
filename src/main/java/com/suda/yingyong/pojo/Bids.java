package com.suda.yingyong.pojo;

import java.util.Date;

public class Bids {
    private int bids_id;
    private String bids_brief;
    private String bids_detail;
    private String bids_link;
    private Date bids_create_time;
    private String bids_operation;

    public Bids(int bids_id, String bids_brief, String bids_detail, String bids_link, Date bids_create_time, String bids_operation) {
        this.bids_id = bids_id;
        this.bids_brief = bids_brief;
        this.bids_detail = bids_detail;
        this.bids_link = bids_link;
        this.bids_create_time = bids_create_time;
        this.bids_operation = bids_operation;
    }

    public Bids() {
    }

    @Override
    public String toString() {
        return "Bids{" +
                "bids_id=" + bids_id +
                ", bids_brief='" + bids_brief + '\'' +
                ", bids_detail='" + bids_detail + '\'' +
                ", bids_link='" + bids_link + '\'' +
                ", bids_create_time=" + bids_create_time +
                ", bids_operation='" + bids_operation + '\'' +
                '}';
    }

    public int getBids_id() {
        return bids_id;
    }

    public void setBids_id(int bids_id) {
        this.bids_id = bids_id;
    }

    public String getBids_brief() {
        return bids_brief;
    }

    public void setBids_brief(String bids_brief) {
        this.bids_brief = bids_brief;
    }

    public String getBids_detail() {
        return bids_detail;
    }

    public void setBids_detail(String bids_detail) {
        this.bids_detail = bids_detail;
    }

    public String getBids_link() {
        return bids_link;
    }

    public void setBids_link(String bids_link) {
        this.bids_link = bids_link;
    }

    public Date getBids_create_time() {
        return bids_create_time;
    }

    public void setBids_create_time(Date bids_create_time) {
        this.bids_create_time = bids_create_time;
    }

    public String getBids_operation() {
        return bids_operation;
    }

    public void setBids_operation(String bids_operation) {
        this.bids_operation = bids_operation;
    }
}
