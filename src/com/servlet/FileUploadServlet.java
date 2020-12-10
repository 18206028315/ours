package com.servlet;


import com.msgsys.dao.Impl.UserDaoImpl;
import com.msgsys.dao.UserDao;
import com.msgsys.entity.User;
import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.FileItemFactory;
import org.apache.commons.fileupload.FileUploadException;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.File;
import java.io.IOException;
import java.util.Date;
import java.util.List;

/**
 * 作者：shizeming
 * 日期: 2020/11/27 9:34
 * 描述:
 */
@WebServlet("/Fileupload")
public class FileUploadServlet extends HttpServlet {
    UserDao userDao=null;
   // UserService userService=new UserServiceImpl();
    public FileUploadServlet(){userDao=new UserDaoImpl();
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html;charset=utf-8");
        request.setCharacterEncoding("utf-8");
          if (ServletFileUpload.isMultipartContent(request)){
              FileItemFactory fileItemFactory =new DiskFileItemFactory();

              ServletFileUpload servletFileUpload=new ServletFileUpload(fileItemFactory);
              User user=new User();
              try {
                  // 解析上传的数据，得到每一个表单项FileItem
                  List<FileItem> list=servletFileUpload.parseRequest(request);
                  // 循环判断，每一个表单项，是普通类型，还是上传的文件
                  for (FileItem fileItem:
                          list){
                      if (fileItem.isFormField()){
                          System.out.println("普通表单项 name= "+fileItem.getFieldName());
                          System.out.println("value ="+fileItem.getString("UTF-8"));

                          String str = fileItem.getFieldName();
                          switch (str) {
                              case "username":
                                  user.setUname(fileItem.getString());
                                  break;
                              case "password":
                                  user.setUpass(fileItem.getString());
                                  break;
                              case "email":
                                  user.setEmail(fileItem.getString());
                                  break;
                          }
                      }else {
                          //上传的文件
                          System.out.println("表单项的name ="+ fileItem.getFieldName());
                          System.out.println("上传的文件名:"+fileItem.getName());
                          try {
                              StringBuilder sb = new StringBuilder("D:\\upload\\");
                              sb.append(new Date().getTime());
                              sb.append(fileItem.getName());
                              //加截取后面为判断即可
                              String path = sb.toString();
                              user.setImgPath(path);
                              fileItem.write(new File(path));
                          } catch (Exception e) {
                              e.printStackTrace();
                          }
                      }
                  }

              } catch (FileUploadException e) {
                  e.printStackTrace();
              }
              int result = userDao.updateimg(user);

              HttpSession session=request.getSession();
              session.setAttribute("user",user);
              response.sendRedirect(request.getContextPath()+"/login.jsp");
              //int result=  userService.modify(user);
          }
    }


}
