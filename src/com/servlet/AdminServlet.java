package com.servlet;

import com.entity.Admin;
import com.google.gson.Gson;
import com.service.AdminService;
import com.service.impl.AdminServiceImpl;
import com.utils.Page;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

import static com.google.code.kaptcha.Constants.KAPTCHA_SESSION_KEY;

/**
 * 作者：xupeiyuan
 * 日期：2020/11/26 18:56
 * 描述：
 */
@WebServlet("/admin.do")
public class AdminServlet extends BaseServlet {
    AdminService adminService = new AdminServiceImpl();

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request,response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        super.doGet(request, response);
    }

    public void queryAdminPage(HttpServletRequest request, HttpServletResponse response) throws IOException {
        Integer pageNo = Integer.valueOf(request.getParameter("pageNo"));
        Page<Admin> page = adminService.queryByPage(pageNo,Page.PAGE_SIZE);
        Gson gson = new Gson();
        String jsonStr = gson.toJson(page);
        response.getWriter().write(jsonStr);
    }

    public void delete(HttpServletRequest request, HttpServletResponse response) throws IOException {
        int userId = Integer.valueOf(request.getParameter("userId"));
        Integer result = adminService.delete(userId);
        response.getWriter().write(result.toString());
    }

    //注册
//    public void register(HttpServletRequest request, HttpServletResponse response) {
//        String username = request.getParameter("username");
//        String password = request.getParameter("password");
//        String email = request.getParameter("email");
//        if (null == username || username.isEmpty() || null == password || password.isEmpty() || null == email || email.isEmpty()) {
//
//            return;
//        }
//
//        User user = new User(username, password, email);
//        int result = userService.register(user);
//         System.out.println(result);
//    }

    //登录
    public void login(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        String token = (String) request.getSession().getAttribute(KAPTCHA_SESSION_KEY);
        System.out.println("谷歌生成的验证码值：" + token);
        String code = request.getParameter("code");
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        Admin admin = adminService.login(new Admin(username, password));
        if (token != null && token.equals(code)) {
            if (admin != null) {
                //登陆成功 请求转发
                response.getWriter().write("true");
                HttpSession session = request.getSession();
                session.setAttribute("admin", admin);
            }
        } else {
            System.out.println("登入失败");
            //登陆失败 重定向
//            response.sendRedirect(request.getContextPath() + "/login.jsp");
        }
    }
}
