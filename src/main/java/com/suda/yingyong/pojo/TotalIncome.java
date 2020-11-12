package com.suda.yingyong.pojo;

import java.util.Date;

public class TotalIncome {
    private int income_id;
    private int income_money;
    private Date income_create_time;

    public TotalIncome(int income_id, int income_money, Date income_create_time) {
        this.income_id = income_id;
        this.income_money = income_money;
        this.income_create_time = income_create_time;
    }

    public TotalIncome() {
    }

    @Override
    public String toString() {
        return "TotalIncome{" +
                "income_id=" + income_id +
                ", income_money=" + income_money +
                ", income_create_time=" + income_create_time +
                '}';
    }

    public int getIncome_id() {
        return income_id;
    }

    public void setIncome_id(int income_id) {
        this.income_id = income_id;
    }

    public int getIncome_money() {
        return income_money;
    }

    public void setIncome_money(int income_money) {
        this.income_money = income_money;
    }

    public Date getIncome_create_time() {
        return income_create_time;
    }

    public void setIncome_create_time(Date income_create_time) {
        this.income_create_time = income_create_time;
    }
}
