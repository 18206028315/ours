package com.entity;

/**
 * 作者：凌宇
 * 日期：2020/12/8 15:40
 * 描述：私信类
 */
public class Letter {
    private Integer l_id;  //私信编号
    private String l_send;  //发送方
    private String l_accept;  //接收方
    private String l_title;  //私信标题
    private String l_content;  //私信内容
    private String I_picture; //附件（地址）
    private String createTime;  //创建时间（发送时间）

    @Override
    public String toString() {
        return "Letter{" +
                "l_id=" + l_id +
                ", l_send='" + l_send + '\'' +
                ", l_accept='" + l_accept + '\'' +
                ", l_title='" + l_title + '\'' +
                ", l_content='" + l_content + '\'' +
                ", I_picture='" + I_picture + '\'' +
                ", createTime='" + createTime + '\'' +
                '}';
    }

    public Integer getL_id() {
        return l_id;
    }

    public void setL_id(Integer l_id) {
        this.l_id = l_id;
    }

    public String getL_send() {
        return l_send;
    }

    public void setL_send(String l_send) {
        this.l_send = l_send;
    }

    public String getL_accept() {
        return l_accept;
    }

    public void setL_accept(String l_accept) {
        this.l_accept = l_accept;
    }

    public String getL_title() {
        return l_title;
    }

    public void setL_title(String l_title) {
        this.l_title = l_title;
    }

    public String getL_content() {
        return l_content;
    }

    public void setL_content(String l_content) {
        this.l_content = l_content;
    }

    public String getI_picture() {
        return I_picture;
    }

    public void setI_picture(String i_picture) {
        I_picture = i_picture;
    }

    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    public Letter() {
    }
}
