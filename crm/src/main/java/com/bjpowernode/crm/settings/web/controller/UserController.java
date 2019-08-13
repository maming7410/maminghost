package com.bjpowernode.crm.settings.web.controller;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * 作者：马明
 * 2019/8/13
 */
public class UserController extends HttpServlet {

    @Override
    protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        System.out.println("欢迎呀！！");
        String path = request.getServletPath();
        if("/settrings/user/xxx.do".equals(path)){
            //xxx
        }else if("/settrings/user/xxx.do".equals(path)){
            //xx
        }
    }
}
