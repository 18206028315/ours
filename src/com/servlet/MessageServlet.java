package com.servlet;

import com.entity.Grade;
import com.entity.Homework;
import com.entity.Letter;
import com.entity.Student;
import com.service.StudentService;
import com.utils.DataCenter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

/**
 * 作者：shizeming
 * 日期: 2020/12/10 15:29
 * 描述:
 */
@WebServlet("/mes.do")
public class MessageServlet extends BaseServlet {
    StudentService studentService=null;
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request,response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        super.doGet(request, response);
    }

    //学生查询该班的所有作业并set
    public void StudentQueryHwAll(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
         Student student =(Student) request.getSession().getAttribute("student");
         System.out.println(student.getS_class());
          List<Homework>homework=studentService.studentQueryByHw(String.valueOf(student.getS_class()));
          request.setAttribute("homework",homework);
   //跳转的页面前端写出来在写
        request.getRequestDispatcher("/list.jsp").forward(request,response);
    }
    //查询自己的成绩并set
    public void studentQueryGrade(HttpServletRequest request, HttpServletResponse response){
        Student student =(Student) request.getSession().getAttribute("student");
        System.out.println(student.getS_id());
       List<Grade>grades= studentService.studentqueryBySid(student.getS_id());
       request.setAttribute("grade",grades);
    }

    //提交作业
    public void studentsubHw(HttpServletRequest request, HttpServletResponse response) throws IOException {
        Grade grade=null;
        Student student=(Student)request.getSession().getAttribute("student");
       String accessory= String.valueOf(request.getAttribute("accessory"));
       String submitTime= String.valueOf(request.getAttribute("submitTime"));
        System.out.println(student.getS_id());
        //grade.setG_hid();
        grade.setG_accessory(accessory);
        grade.setSubmitTime(submitTime);
        grade.setG_sid(student.getS_id());
       Integer i= studentService.studentUpdateHomeWork(grade);
       if (i==0){
           response.getWriter().print("<script>alert('提交成功')</script>");
           //返回上一个页面
           response.getWriter().println("<script>window.location.href='./login.jsp'</script>");
       }else {
           response.getWriter().print("<script>alert('提交失败')</script>");
           //返回这个页面
           response.getWriter().println("<script>window.location.href='./login.jsp'</script>");
       }
    }


    //发送私信
    public void studentSendLetter(HttpServletRequest request, HttpServletResponse response){
        String accept= request.getParameter("accept");
        System.out.println(accept);
       List<Letter>letters= studentService.StudentQueryByAccept(accept);
       request.setAttribute("sendLetter",letters);
    }
    //查看自己发的私信
    public void studentAcceptLetter(HttpServletRequest request, HttpServletResponse response){
      Student student=(Student)  request.getSession().getAttribute("student");
        System.out.println(student.getS_id());
        List<Letter> letters = studentService.StudentQueryBySend(String.valueOf(student.getS_id()));
        request.setAttribute("accpetLetter",letters);
    }




































































































































































































































































































}
