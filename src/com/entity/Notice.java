package com.entity;

/**
 * 作者：凌宇
 * 日期：2020/12/8 15:40
 * 描述：公告栏（所有人可见）
 */
public class Notice {
    private Integer n_id;  //告示编号
    private String n_title;  //告示标题
    private String n_content;  //告示内容
    private String n_picture;  //附件（地址）
    private String createTime;  //创建时间（告示发布时间）

    @Override
    public String toString() {
        return "Notice{" +
                "n_id=" + n_id +
                ", n_title='" + n_title + '\'' +
                ", n_content='" + n_content + '\'' +
                ", n_picture='" + n_picture + '\'' +
                ", createTime='" + createTime + '\'' +
                '}';
    }

    public Integer getN_id() {
        return n_id;
    }

    public void setN_id(Integer n_id) {
        this.n_id = n_id;
    }

    public String getN_title() {
        return n_title;
    }

    public void setN_title(String n_title) {
        this.n_title = n_title;
    }

    public String getN_content() {
        return n_content;
    }

    public void setN_content(String n_content) {
        this.n_content = n_content;
    }

    public String getN_picture() {
        return n_picture;
    }

    public void setN_picture(String n_picture) {
        this.n_picture = n_picture;
    }

    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    public Notice() {
    }
}
