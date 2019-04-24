package com.course.servlet;

import com.alibaba.fastjson.JSON;
import com.course.service.CourseService;
import com.course.service.serviceimpl.CourseServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Map;

/**
*   登录的Servlet
*   @author albert
*   @date 2019/4/20
*
*/
@WebServlet("/login")
public class LoginServlet extends HttpServlet {
    private CourseService cs = new CourseServiceImpl();
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String username = request.getParameter("username");
        String password = request.getParameter("password");

        String code = request.getParameter("code");
        String checkCode = (String) request.getSession().getAttribute("kcode");
        Map<String, String> result = new HashMap<>();
        PrintWriter out = response.getWriter();
        if(code!=null&checkCode!=null) {
            //如果用户输入的验证码和产生在服务器端的验证码一致，那么就告诉用户输入正确
            if (code.equalsIgnoreCase(checkCode)) {
                //登录逻辑、注册逻辑等相关的业务操作
                //账号密码正确
                if(cs.login(username, password) == 0){
                    //账号密码不对，登录失败
                    result.put("fail", "失败");
                    out.print(JSON.toJSONString(result));
                }else{
                    request.getSession().setAttribute("loginUser",username);
                    if(cs.login(username, password)== 1){
                        //超级管理员
                        request.getSession().setAttribute("flag",1);
                    }else{
                        //普通用户
                        request.getSession().setAttribute("flag",0);
                    }
                    result.put("success", "成功");
                    out.print(JSON.toJSONString(result));
                }

            } else {
                result.put("fail", "失败");
                out.print(JSON.toJSONString(result));
            }
        }
        out.flush();
        out.close();

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
            doPost(request,response);
    }
}
