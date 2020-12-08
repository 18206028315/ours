package com.entity;

/**
 * 作者：凌宇
 * 日期：2020/12/8 15:40
 * 描述：成绩类
 */
public class Grade {
    private Integer g_id;  //成绩编号
    private Integer g_hid;  //作业编号
    private Integer g_sid;  //学生编号
    private String g_homeworkStatus;  //学生作业状态(已读/未读/已提交/已审批)
    private String g_picture; //附件（地址）
    private String g_grade;  //成绩
    private String g_remark;  //老师评语
    private String submitTime;  //作业提交时间
    private String createTime;  //创建时间（作业发布时间）

    @Override
    public String toString() {
        return "Grade{" +
                "g_id=" + g_id +
                ", g_hid=" + g_hid +
                ", g_sid=" + g_sid +
                ", g_homeworkStatus='" + g_homeworkStatus + '\'' +
                ", g_picture='" + g_picture + '\'' +
                ", g_grade='" + g_grade + '\'' +
                ", g_remark='" + g_remark + '\'' +
                ", submitTime='" + submitTime + '\'' +
                ", createTime='" + createTime + '\'' +
                '}';
    }

    public Integer getG_id() {
        return g_id;
    }

    public void setG_id(Integer g_id) {
        this.g_id = g_id;
    }

    public Integer getG_hid() {
        return g_hid;
    }

    public void setG_hid(Integer g_hid) {
        this.g_hid = g_hid;
    }

    public Integer getG_sid() {
        return g_sid;
    }

    public void setG_sid(Integer g_sid) {
        this.g_sid = g_sid;
    }

    public String getG_homeworkStatus() {
        return g_homeworkStatus;
    }

    public void setG_homeworkStatus(String g_homeworkStatus) {
        this.g_homeworkStatus = g_homeworkStatus;
    }

    public String getG_picture() {
        return g_picture;
    }

    public void setG_picture(String g_picture) {
        this.g_picture = g_picture;
    }

    public String getG_grade() {
        return g_grade;
    }

    public void setG_grade(String g_grade) {
        this.g_grade = g_grade;
    }

    public String getG_remark() {
        return g_remark;
    }

    public void setG_remark(String g_remark) {
        this.g_remark = g_remark;
    }

    public String getSubmitTime() {
        return submitTime;
    }

    public void setSubmitTime(String submitTime) {
        this.submitTime = submitTime;
    }

    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    public Grade() {
    }
}
