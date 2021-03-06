package com.servlet;

import com.entity.Student;
import com.service.Impl.StudentServiceImpl;
import com.service.StudentService;
import com.utils.DataCenter;
import org.apache.tools.ant.taskdefs.Get;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.sound.midi.Soundbank;
import java.io.IOException;
import java.io.UnsupportedEncodingException;

import static com.google.code.kaptcha.Constants.KAPTCHA_SESSION_KEY;

/**
 * 作者：shizeming
 * 日期: 2020/12/10 14:47
 * 描述:
 */
@WebServlet("/stu.do")
public class StudentServlet extends BaseServlet {
    StudentService studentService=new StudentServiceImpl();
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
         doGet(request,response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        super.doGet(request, response);
    }

    //学生登录
    public void stuLogin(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
         String username=request.getParameter("username");
         String password=request.getParameter("password");
         System.out.println(username+" "+password);
         Student student=studentService.login(username,password);
         response.setContentType("text/html;charset=utf-8");
         request.setCharacterEncoding("utf-8");
         //获取验证码
        String token = (String) request.getSession().getAttribute(KAPTCHA_SESSION_KEY);
        System.out.println("谷歌生成的验证码：" + token);
        String code = request.getParameter("code");

        if (student==null){
            response.getWriter().print("<script>alert('帐号密码错误')</script>");
            //跳转登录页面 后续在写
            response.getWriter().println("<script>window.location.href='./login.jsp'</script>");
        }

        if (token != null && token.equalsIgnoreCase(code)) {
            if (student != null) {
                HttpSession session = request.getSession();
                session.setAttribute("student", student);
                request.getRequestDispatcher("/message.do?action=queryList").forward(request, response);
            }
        } else {
            response.getWriter().print("<script>alert('验证码错误')</script>");
            response.getWriter().println("<script>window.location.href='./login.jsp'</script>");
        }
    }


    public  void  studentModifyPssword(HttpServletRequest request, HttpServletResponse response) throws IOException {
         String password= String.valueOf(request.getParameter("password"));
        Student student=(Student) request.getSession().getAttribute("student");
       Integer i= studentService.StudentUpdatePassword(password,student.getS_id());
        System.out.println(i);
        if (i!=0){
            response.getWriter().print("<script>alert('修改密码成功')</script>");
            response.getWriter().println("<script>window.location.href='./login.jsp'</script>");
        }else {
            response.getWriter().print("<script>alert('修改密码失败')</script>");
            response.getWriter().println("<script>window.location.href='./login.jsp'</script>");
        }
    }

    public void studentModifyMessage(HttpServletRequest request, HttpServletResponse response) throws IOException {
     String img=   request.getParameter("img");
        String phone=    request.getParameter("phone");
        String sex=   request.getParameter("sex");
        String age=   request.getParameter("age");
        String email=  request.getParameter("email");
        Student student=(Student) request.getSession().getAttribute("student");
        Student student1=null;
        student1.setS_img(img);
        student1.setS_phone(phone);
        student1.setS_age(age);
        student1.setS_email(email);
        student1.setS_sex(sex);
        student1.setS_id(student.getS_id());
        Integer i= studentService.StudentUpdateMessage(student1);
        System.out.println(i);
        if (i!=0){
            response.getWriter().print("<script>alert('修改个人信息成功')</script>");
            response.getWriter().println("<script>window.location.href='./login.jsp'</script>");
        }else {
            response.getWriter().print("<script>alert('修改个人信息失败')</script>");
            response.getWriter().println("<script>window.location.href='./login.jsp'</script>");
        }
    }
}
