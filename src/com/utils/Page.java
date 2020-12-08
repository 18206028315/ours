package com.utils;

/**
 * 作者：凌宇
 * 日期：2020/12/1 18:54
 * 描述：
 */

import java.util.List;

/**
 * Page 是分页的模型对象
 *
 * @param <T> 是具体的 JavaBean 类
 */
public class Page<T> {
    //每页条数默认值
    public static final Integer PAGE_SIZE = 5;
    //当前页码
    private Integer pageNo;
    //总页码
    private Integer pageTotal;
    //当前页条数
    private Integer pageSize = PAGE_SIZE;
    //总条数
    private Integer PageTotalCount;
    //当前页数据
    private List<T> items;

    @Override
    public String toString() {
        return "Page{" +
                "pageNo=" + pageNo +
                ", pageTotal=" + pageTotal +
                ", pageSize=" + pageSize +
                ", PageTotalCount=" + PageTotalCount +
                ", items=" + items +
                '}';
    }

    public Integer getPageNo() {
        return pageNo;
    }

    public void setPageNo(Integer pageNo) {
        this.pageNo = pageNo;
    }

    public Integer getPageTotal() {
        return pageTotal;
    }

    public void setPageTotal(Integer pageTotal) {
        this.pageTotal = pageTotal;
    }

    public Integer getPageSize() {
        return pageSize;
    }

    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }

    public Integer getPageTotalCount() {
        return PageTotalCount;
    }

    public void setPageTotalCount(Integer pageTotalCount) {
        PageTotalCount = pageTotalCount;
    }

    public List<T> getItems() {
        return items;
    }

    public void setItems(List<T> items) {
        this.items = items;
    }

    public Page() {
    }
}
