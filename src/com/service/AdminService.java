package com.service;

import com.entity.Admin;
import com.utils.Page;

/**
 * 作者：xupeiyuan
 * 日期: 2020/12/9 9:53
 * 描述:
 */
public interface AdminService {

    //登录
    Admin login(Admin user);

    /**
     *
     * @param pageNo 当前页码
     * @param pageSize 每页展示数量
     * @return 分页后的user Page
     */
    Page<Admin> queryByPage(Integer pageNo, Integer pageSize);
    //删除管理员
    Integer delete(int userId);
}
