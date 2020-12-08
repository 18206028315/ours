package com.entity;

/**
 * 作者：凌宇
 * 日期：2020/12/8 15:39
 * 描述：班级类
 */
public class Class {
    private Integer c_id; //班级编号
    private String c_name;  //班级名
    private Integer c_bid;  //告示编号
    private Integer c_fid;  //论坛编号

    @Override
    public String toString() {
        return "Class{" +
                "c_id=" + c_id +
                ", c_name='" + c_name + '\'' +
                ", c_bid=" + c_bid +
                ", c_fid=" + c_fid +
                '}';
    }

    public Integer getC_id() {
        return c_id;
    }

    public void setC_id(Integer c_id) {
        this.c_id = c_id;
    }

    public String getC_name() {
        return c_name;
    }

    public void setC_name(String c_name) {
        this.c_name = c_name;
    }

    public Integer getC_bid() {
        return c_bid;
    }

    public void setC_bid(Integer c_bid) {
        this.c_bid = c_bid;
    }

    public Integer getC_fid() {
        return c_fid;
    }

    public void setC_fid(Integer c_fid) {
        this.c_fid = c_fid;
    }

    public Class() {
    }
}
