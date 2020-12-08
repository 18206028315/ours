package com.entity;

/**
 * 作者：凌宇
 * 日期：2020/12/8 15:40
 * 描述：论坛类
 */
public class Forum {
    private Integer f_id;  //帖子编号
    private Integer f_send;  //发送方
    private String f_title;  //帖子标题
    private String f_content;  //帖子内容
    private String f_picture;  //附件（地址）
    private String createTime; //创建时间（发布时间）

    @Override
    public String toString() {
        return "Forum{" +
                "f_id=" + f_id +
                ", f_send=" + f_send +
                ", f_title='" + f_title + '\'' +
                ", f_content='" + f_content + '\'' +
                ", f_picture='" + f_picture + '\'' +
                ", createTime='" + createTime + '\'' +
                '}';
    }

    public Integer getF_send() {
        return f_send;
    }

    public void setF_send(Integer f_send) {
        this.f_send = f_send;
    }

    public Integer getF_id() {
        return f_id;
    }

    public void setF_id(Integer f_id) {
        this.f_id = f_id;
    }


    public String getF_title() {
        return f_title;
    }

    public void setF_title(String f_title) {
        this.f_title = f_title;
    }

    public String getF_content() {
        return f_content;
    }

    public void setF_content(String f_content) {
        this.f_content = f_content;
    }

    public String getF_picture() {
        return f_picture;
    }

    public void setF_picture(String f_picture) {
        this.f_picture = f_picture;
    }

    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    public Forum() {
    }
}
