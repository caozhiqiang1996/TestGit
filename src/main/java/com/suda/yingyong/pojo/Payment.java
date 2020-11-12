package com.suda.yingyong.pojo;

public class Payment {
    private int payment_id;
    private int user_id;
    private int payment_keywords;
    private int payment_create_time;
    private int payment_edit_time;
    private int payment_resource;
    private int payment_illustrate;

    public Payment(int payment_id, int user_id, int payment_keywords, int payment_create_time, int payment_edit_time, int payment_resource, int payment_illustrate) {
        this.payment_id = payment_id;
        this.user_id = user_id;
        this.payment_keywords = payment_keywords;
        this.payment_create_time = payment_create_time;
        this.payment_edit_time = payment_edit_time;
        this.payment_resource = payment_resource;
        this.payment_illustrate = payment_illustrate;
    }

    public Payment() {
    }

    @Override
    public String toString() {
        return "Payment{" +
                "payment_id=" + payment_id +
                ", user_id=" + user_id +
                ", payment_keywords=" + payment_keywords +
                ", payment_create_time=" + payment_create_time +
                ", payment_edit_time=" + payment_edit_time +
                ", payment_resource=" + payment_resource +
                ", payment_illustrate=" + payment_illustrate +
                '}';
    }

    public int getPayment_id() {
        return payment_id;
    }

    public void setPayment_id(int payment_id) {
        this.payment_id = payment_id;
    }

    public int getUser_id() {
        return user_id;
    }

    public void setUser_id(int user_id) {
        this.user_id = user_id;
    }

    public int getPayment_keywords() {
        return payment_keywords;
    }

    public void setPayment_keywords(int payment_keywords) {
        this.payment_keywords = payment_keywords;
    }

    public int getPayment_create_time() {
        return payment_create_time;
    }

    public void setPayment_create_time(int payment_create_time) {
        this.payment_create_time = payment_create_time;
    }

    public int getPayment_edit_time() {
        return payment_edit_time;
    }

    public void setPayment_edit_time(int payment_edit_time) {
        this.payment_edit_time = payment_edit_time;
    }

    public int getPayment_resource() {
        return payment_resource;
    }

    public void setPayment_resource(int payment_resource) {
        this.payment_resource = payment_resource;
    }

    public int getPayment_illustrate() {
        return payment_illustrate;
    }

    public void setPayment_illustrate(int payment_illustrate) {
        this.payment_illustrate = payment_illustrate;
    }
}
