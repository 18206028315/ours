package com.entity;

/**
 * 作者：凌宇
 * 日期：2020/12/8 15:40
 * 描述：私信类
 */
public class Letter {
    private Integer l_id;  //私信编号
    private String l_send;  //发送方编号
    private String l_sendName;  //发送方姓名
    private String l_accept;  //接收方编号
    private String l_acceptName;  //接收方姓名
    private String l_title;  //私信标题
    private String l_content;  //私信内容
    private String l_accessory; //附件（地址）
    private String l_status;//状态（已读未读）
    private String createTime;  //创建时间（发送时间）

    @Override
    public String toString() {
        return "Letter{" +
                "l_id=" + l_id +
                ", l_send='" + l_send + '\'' +
                ", l_sendName='" + l_sendName + '\'' +
                ", l_accept='" + l_accept + '\'' +
                ", l_acceptName='" + l_acceptName + '\'' +
                ", l_title='" + l_title + '\'' +
                ", l_content='" + l_content + '\'' +
                ", l_accessory='" + l_accessory + '\'' +
                ", l_status='" + l_status + '\'' +
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

    public String getL_sendName() {
        return l_sendName;
    }

    public void setL_sendName(String l_sendName) {
        this.l_sendName = l_sendName;
    }

    public String getL_accept() {
        return l_accept;
    }

    public void setL_accept(String l_accept) {
        this.l_accept = l_accept;
    }

    public String getL_acceptName() {
        return l_acceptName;
    }

    public void setL_acceptName(String l_acceptName) {
        this.l_acceptName = l_acceptName;
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

    public String getL_accessory() {
        return l_accessory;
    }

    public void setL_accessory(String l_accessory) {
        this.l_accessory = l_accessory;
    }

    public String getL_status() {
        return l_status;
    }

    public void setL_status(String l_status) {
        this.l_status = l_status;
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
