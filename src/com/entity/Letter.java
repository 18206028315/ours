package com.entity;

/**
 * 作者：凌宇
 * 日期：2020/12/8 15:40
 * 描述：私信类
 */
public class Letter {
    private Integer l_id;  //私信编号
    private Integer l_send;  //发送方编号
    private String I_sendName;  //发送方姓名
    private Integer l_accept;  //接收方编号
    private String I_acceptName;  //接收方姓名
    private String l_title;  //私信标题
    private String l_content;  //私信内容
    private String I_accessory; //附件（地址）
    private String createTime;  //创建时间（发送时间）


    @Override
    public String toString() {
        return "Letter{" +
                "l_id=" + l_id +
                ", l_send=" + l_send +
                ", I_sendName='" + I_sendName + '\'' +
                ", l_accept=" + l_accept +
                ", I_acceptName='" + I_acceptName + '\'' +
                ", l_title='" + l_title + '\'' +
                ", l_content='" + l_content + '\'' +
                ", I_accessory='" + I_accessory + '\'' +
                ", createTime='" + createTime + '\'' +
                '}';
    }

    public Integer getL_send() {
        return l_send;
    }

    public void setL_send(Integer l_send) {
        this.l_send = l_send;
    }

    public String getI_sendName() {
        return I_sendName;
    }

    public void setI_sendName(String i_sendName) {
        I_sendName = i_sendName;
    }

    public Integer getL_accept() {
        return l_accept;
    }

    public void setL_accept(Integer l_accept) {
        this.l_accept = l_accept;
    }

    public String getI_acceptName() {
        return I_acceptName;
    }

    public void setI_acceptName(String i_acceptName) {
        I_acceptName = i_acceptName;
    }

    public String getI_accessory() {
        return I_accessory;
    }

    public void setI_accessory(String i_accessory) {
        I_accessory = i_accessory;
    }

    public Integer getL_id() {
        return l_id;
    }

    public void setL_id(Integer l_id) {
        this.l_id = l_id;
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


    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    public Letter() {
    }
}
