package com.entity;

import java.util.Date;

/**
 * 作者：xupeiyuan
 * 日期: 2020/12/10 16:05
 * 描述:教学资料类（用于界面显示可下载）
 */
public class Documana {
    private Integer d_id;//教学资料id
    private String d_name;//教学资料名称
    private String d_content;//教学资料内容
    private String d_path;//教学资料下载路径
    private Date d_creatime;//添加教学资料时间

    public Documana(Integer d_id, String d_name, String d_content, String d_path, Date d_creatime) {
        this.d_id = d_id;
        this.d_name = d_name;
        this.d_content = d_content;
        this.d_path = d_path;
        this.d_creatime = d_creatime;
    }

    public Integer getD_id() {
        return d_id;
    }

    public void setD_id(Integer d_id) {
        this.d_id = d_id;
    }

    public String getD_name() {
        return d_name;
    }

    public void setD_name(String d_name) {
        this.d_name = d_name;
    }

    public String getD_content() {
        return d_content;
    }

    public void setD_content(String d_content) {
        this.d_content = d_content;
    }

    public String getD_path() {
        return d_path;
    }

    public void setD_path(String d_path) {
        this.d_path = d_path;
    }

    public Date getD_creatime() {
        return d_creatime;
    }

    public void setD_creatime(Date d_creatime) {
        this.d_creatime = d_creatime;
    }

    @Override
    public String toString() {
        return "Documana{" +
                "d_id=" + d_id +
                ", d_name='" + d_name + '\'' +
                ", d_content='" + d_content + '\'' +
                ", d_path='" + d_path + '\'' +
                ", d_creatime=" + d_creatime +
                '}';
    }
}
