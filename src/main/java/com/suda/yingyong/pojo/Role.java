package com.suda.yingyong.pojo;



public class Role {
    private int role_id;
    private int user_id;
    private String role_desc;

    public Role(int role_id, int user_id, String role_desc) {
        this.role_id = role_id;
        this.user_id = user_id;
        this.role_desc = role_desc;
    }

    public Role() {
    }

    @Override
    public String toString() {
        return "Role{" +
                "role_id=" + role_id +
                ", user_id=" + user_id +
                ", role_desc='" + role_desc + '\'' +
                '}';
    }

    public int getRole_id() {
        return role_id;
    }

    public void setRole_id(int role_id) {
        this.role_id = role_id;
    }

    public int getUser_id() {
        return user_id;
    }

    public void setUser_id(int user_id) {
        this.user_id = user_id;
    }

    public String getRole_desc() {
        return role_desc;
    }

    public void setRole_desc(String role_desc) {
        this.role_desc = role_desc;
    }
}
