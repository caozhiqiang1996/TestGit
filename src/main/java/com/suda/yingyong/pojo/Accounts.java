package com.suda.yingyong.pojo;

import javax.xml.crypto.Data;
import java.util.Date;

public class Accounts {
    private int user_id;
    private int acc_remain;
    private int acc_total;
    private Date acc_last_credit_dt;
    private Date acc_last_debit_dt;

    public int getUser_id() {
        return user_id;
    }

    public void setUser_id(int user_id) {
        this.user_id = user_id;
    }

    public int getAcc_remain() {
        return acc_remain;
    }

    public void setAcc_remain(int acc_remain) {
        this.acc_remain = acc_remain;
    }

    public int getAcc_total() {
        return acc_total;
    }

    public void setAcc_total(int acc_total) {
        this.acc_total = acc_total;
    }

    public Date getAcc_last_credit_dt() {
        return acc_last_credit_dt;
    }

    public void setAcc_last_credit_dt(Date acc_last_credit_dt) {
        this.acc_last_credit_dt = acc_last_credit_dt;
    }

    public Date getAcc_last_debit_dt() {
        return acc_last_debit_dt;
    }

    public void setAcc_last_debit_dt(Date acc_last_debit_dt) {
        this.acc_last_debit_dt = acc_last_debit_dt;
    }

    @Override
    public String toString() {
        return "Accounts{" +
                "user_id=" + user_id +
                ", acc_remain=" + acc_remain +
                ", acc_total=" + acc_total +
                ", acc_last_credit_dt=" + acc_last_credit_dt +
                ", acc_last_debit_dt=" + acc_last_debit_dt +
                '}';
    }

    public Accounts(int user_id, int i, int i1) {
        this.user_id = user_id;
        this.acc_remain = acc_remain;
        this.acc_total = acc_total;
    }

    public Accounts(int user_id, int acc_remain, int acc_total, Date acc_last_credit_dt, Date acc_last_debit_dt) {
        this.user_id = user_id;
        this.acc_remain = acc_remain;
        this.acc_total = acc_total;
        this.acc_last_credit_dt = acc_last_credit_dt;
        this.acc_last_debit_dt = acc_last_debit_dt;
    }
}

