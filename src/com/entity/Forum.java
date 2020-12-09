package com.entity;

/**
 * 作者：凌宇
 * 日期：2020/12/8 15:40
 * 描述：论坛类
 */
public class Forum {
    private Integer f_id;  //帖子编号
    private Integer f_send;  //发送方
    private String f_sendName;  //发送方姓名
    private String f_title;  //帖子标题
    private String f_content;  //帖子内容
    private String f_accessory;  //附件（地址）
    private String createTime; //创建时间（发布时间）

    @Override
    public String toString() {
        return "Forum{" +
                "f_id=" + f_id +
                ", f_send=" + f_send +
                ", f_sendName='" + f_sendName + '\'' +
                ", f_title='" + f_title + '\'' +
                ", f_content='" + f_content + '\'' +
                ", f_accessory='" + f_accessory + '\'' +
                ", createTime='" + createTime + '\'' +
                '}';
    }

    public String getF_sendName() {
        return f_sendName;
    }

    public void setF_sendName(String f_sendName) {
        this.f_sendName = f_sendName;
    }

    public String getF_accessory() {
        return f_accessory;
    }

    public void setF_accessory(String f_accessory) {
        this.f_accessory = f_accessory;
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



    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    public Forum() {
    }
}
