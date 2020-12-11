package com.service.Impl;

import com.entity.*;
import com.service.TeacherService;
import com.utils.DataCenter;
import com.utils.MessageUtils;

import java.util.List;

/**
 * 作者：凌宇
 * 日期：2020/12/10 16:24
 * 描述：教师功能实现类
 */
public class TeacherServiceImpl implements TeacherService {

    //登录
    @Override
    public Teacher login(String t_username, String t_password) {
        return DataCenter.teacherDao().queryTeacherByUsernameAndPassword(t_username, t_password);
    }

    //修改个人信息
    @Override
    public Integer teacherUpdatePersonalInformation(Teacher teacher) {
        return DataCenter.teacherDao().teacherUpdatePersonalInformation(teacher);
    }

    //修改密码
    @Override
    public Integer teacherUpdatePasswordById(String t_password, Integer t_id) {
        return DataCenter.teacherDao().teacherUpdatePasswordById(t_password, t_id);
    }

    //发布作业
    @Override
    public Boolean teacherPublishJob(Integer t_class, Homework homework) {
        //插入作业表
        Integer i = DataCenter.homeworkDao().teacherInsertHomework(homework);
        //计算插入成绩表的成功次数
        Integer success = 0;

        if (i == 1) {
            //通过教师编号和创建时间查询作业编号
            Integer h_tid = homework.getH_tid();
            String createTime = homework.getCreateTime();
            Homework homework1 = DataCenter.homeworkDao().teacherQueryByTeacherIdAndCreateTime(h_tid, createTime);

            Integer g_hid = homework1.getH_id(); //拼凑成绩表的作业编号
            String g_tName = homework.getH_tName(); //拼凑老师姓名
            String g_hTitle = homework.getH_title(); //拼凑作业标题
            String g_homeworkStatus = "未读";  //拼凑作业状态

            List<Student> studentList = DataCenter.studentDao().teacherQueryStudentByClassId(t_class);
            for (Student student : studentList) {
                Integer g_sid = student.getS_id();  //拼凑学生编号
                String g_sName = student.getS_name();  //拼凑学生姓名
                //我来组成头部
                Grade grade = new Grade();
                grade.setG_hid(g_hid);
                grade.setG_tName(g_tName);
                grade.setG_sid(g_sid);
                grade.setG_sName(g_sName);
                grade.setG_hTitle(g_hTitle);
                grade.setG_homeworkStatus(g_homeworkStatus);
                grade.setCreateTime(MessageUtils.GetNowTime());
                Integer integer = DataCenter.gradeDao().teacherInsertGrade(grade);
                success += integer;
            }
            if (success == studentList.size()) {
                return true;
            }
            return false;
        }
        return false;
    }

    //删除作业
    @Override
    public Boolean teacherDeleteHomeworkById(Integer h_id,Integer t_class) {
        //删除作业表中的数据
        Integer i = DataCenter.homeworkDao().teacherDeleteHomeworkById(h_id);
        if (i == 1) {
            //查询班级人数
            List<Student> studentList = DataCenter.studentDao().teacherQueryStudentByClassId(t_class);
            //删除成绩表的数据
            Integer integer = DataCenter.gradeDao().teacherDeleteGradeByHomeworkId(h_id);
            if (integer == studentList.size()) {
                return true;
            }
            return false;
        }
        return false;
    }

    @Override
    public List<Grade> teacherQueryGradeByHomeworkId(Integer g_hid) {
        return null;
    }

    @Override
    public List<Grade> teacherQueryGradeByHomeworkIdAndHomeworkStatus(Integer g_hid, String status1, String status2) {
        return null;
    }

    @Override
    public Integer teacherUpdateGradeByGradeId(Grade grade) {
        return null;
    }

    @Override
    public List<Letter> teacherQueryLetterByAccept(String l_accept) {
        return null;
    }

    @Override
    public List<Letter> teacherQueryLetterBySend(String l_send) {
        return null;
    }

    @Override
    public List<Student> teacherQueryStudentByClassId(Integer s_class) {
        return null;
    }

}
