package com.yeonjin.chap01.section01.xml;

import jakarta.servlet.*;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

public class LifeCycleTestServlet extends HttpServlet {

    private int initCount = 1;
    private int serviceCount = 1;
    private int destroyCount = 1;

    public LifeCycleTestServlet(){

    }

    @Override
    public void init(ServletConfig config) throws ServletException {
        System.out.println(initCount++);
    }

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println(serviceCount++);
    }


    @Override
    public void destroy() {
        System.out.println(destroyCount++);
    }
}
