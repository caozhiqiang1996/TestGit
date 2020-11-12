package com.suda.yingyong.pojo;

public class Configuration {
    private int config_id;
    private String config_name;
    private String config_value;
    private String config_desc;

    public int getConfig_id() {
        return config_id;
    }

    public void setConfig_id(int config_id) {
        this.config_id = config_id;
    }

    public String getConfig_name() {
        return config_name;
    }

    public void setConfig_name(String config_name) {
        this.config_name = config_name;
    }

    public String getConfig_value() {
        return config_value;
    }

    public void setConfig_value(String config_value) {
        this.config_value = config_value;
    }

    public String getConfig_desc() {
        return config_desc;
    }

    public void setConfig_desc(String config_desc) {
        this.config_desc = config_desc;
    }

    @Override
    public String toString() {
        return "Configuration{" +
                "config_id=" + config_id +
                ", config_name='" + config_name + '\'' +
                ", config_value='" + config_value + '\'' +
                ", config_desc='" + config_desc + '\'' +
                '}';
    }

    public Configuration() {
    }

    public Configuration(int config_id, String config_name, String config_value, String config_desc) {
        this.config_id = config_id;
        this.config_name = config_name;
        this.config_value = config_value;
        this.config_desc = config_desc;
    }
}
