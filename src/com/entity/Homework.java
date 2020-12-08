package com.entity;

import org.omg.CORBA.PRIVATE_MEMBER;

/**
 * 作者：凌宇
 * 日期：2020/12/8 15:40
 * 描述：作业类（老师发布作业）
 */
public class Homework {
    private Integer h_id;  //作业ID
    private Integer h_tid;  //老师编号
    private String h_title;  //作业标题
    private String h_attarName;  //附件标题
    private String h_attar;  //附件（地址）
    private String createTime;  //创建时间（作业发布时间）

    @Override
    public String toString() {
        return "Homework{" +
                "h_id=" + h_id +
                ", h_tid=" + h_tid +
                ", h_title='" + h_title + '\'' +
                ", h_attarName='" + h_attarName + '\'' +
                ", h_attar='" + h_attar + '\'' +
                ", createTime='" + createTime + '\'' +
                '}';
    }

    public Integer getH_id() {
        return h_id;
    }

    public void setH_id(Integer h_id) {
        this.h_id = h_id;
    }

    public Integer getH_tid() {
        return h_tid;
    }

    public void setH_tid(Integer h_tid) {
        this.h_tid = h_tid;
    }

    public String getH_title() {
        return h_title;
    }

    public void setH_title(String h_title) {
        this.h_title = h_title;
    }

    public String getH_attarName() {
        return h_attarName;
    }

    public void setH_attarName(String h_attarName) {
        this.h_attarName = h_attarName;
    }

    public String getH_attar() {
        return h_attar;
    }

    public void setH_attar(String h_attar) {
        this.h_attar = h_attar;
    }

    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    public Homework() {
    }
}
