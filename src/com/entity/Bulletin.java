package com.entity;

/**
 * 作者：凌宇
 * 日期：2020/12/8 15:38
 * 描述：告示栏类（班级内可见）
 */
public class Bulletin {
    private Integer b_id; //告示编号
    private Integer b_send; //发送方编号
    private String b_sendName;  //发送方姓名
    private String b_title;  //发布的标题
    private String b_content;  //发布的内容
    private String b_accessory;  //附件（地址）

    @Override
    public String toString() {
        return "Bulletin{" +
                "b_id=" + b_id +
                ", b_send=" + b_send +
                ", b_sendName='" + b_sendName + '\'' +
                ", b_title='" + b_title + '\'' +
                ", b_content='" + b_content + '\'' +
                ", b_accessory='" + b_accessory + '\'' +
                '}';
    }

    public Integer getB_send() {
        return b_send;
    }

    public void setB_send(Integer b_send) {
        this.b_send = b_send;
    }

    public String getB_sendName() {
        return b_sendName;
    }

    public void setB_sendName(String b_sendName) {
        this.b_sendName = b_sendName;
    }

    public String getB_accessory() {
        return b_accessory;
    }

    public void setB_accessory(String b_accessory) {
        this.b_accessory = b_accessory;
    }

    public Integer getB_id() {
        return b_id;
    }

    public void setB_id(Integer b_id) {
        this.b_id = b_id;
    }

    public String getB_title() {
        return b_title;
    }

    public void setB_title(String b_title) {
        this.b_title = b_title;
    }

    public String getB_content() {
        return b_content;
    }

    public void setB_content(String b_content) {
        this.b_content = b_content;
    }



    public Bulletin() {
    }
}
