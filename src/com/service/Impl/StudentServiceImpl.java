package com.service.Impl;

import com.dao.StudentDao;
import com.entity.Student;
import com.service.StudentService;

/**
 * 作者：shizeming
 * 日期: 2020/12/8 18:10
 * 描述:
 */
public class StudentServiceImpl implements StudentService {
    StudentDao studentDao=new StudentDaoImpl();
    @Override
    public Student queryUserByUsername(String username) {
        return studentDao.queryUserByUsername(username);
    }

    @Override
    public Student login(String username, String password) {
        return studentDao.querystuByuserNamePassW(username, password);
    }


}
