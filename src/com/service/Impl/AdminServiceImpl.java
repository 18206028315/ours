package com.service.impl;

import com.dao.AdminDao;
import com.dao.impl.AdminDaoImpl;
import com.entity.Admin;
import com.service.AdminService;
import com.utils.Page;

import java.util.List;

/**
 * 作者：xupeiyuan
 * 日期: 2020/12/9 9:53
 * 描述:
 */
public class AdminServiceImpl implements AdminService {
    AdminDao adminDao = new AdminDaoImpl();
    @Override
    public Admin login(Admin user) {
        return adminDao.queryUserByNameAndPassword(user);
    }

    @Override
    public Page<Admin> queryByPage(Integer pageNo, Integer pageSize) {
        Page<Admin> page = new Page<>();
        //设置当前页码
        page.setPageNo(pageNo);
        //设置每页展示的数量
        page.setPageSize(pageSize);
        //求总记录数
        Integer pageTotalCount = adminDao.queryPageTotalCount();
        //设置总记录数
        page.setPageTotalCount(Math.toIntExact(pageTotalCount));
        //求总页码
        Integer pageTotal = pageTotalCount / pageSize;
        //如果总记录数对每页展示的记录数不能整除 总页数要加1
        if (pageTotalCount%pageSize>0){
            pageTotal+=1;
        }
        //设置总页码
        page.setPageTotal(pageTotal);
        //求当前页数据的开始索引
        int begin = (page.getPageNo()-1)*pageSize;
        List<Admin> items = adminDao.queryUserByPage(begin,pageSize);
        //设置当前页面的数据
        page.setItems(items);

        return page;
    }
//删除管理员
    @Override
    public Integer delete(int userId) {
        return adminDao.delete(userId);
    }
}
