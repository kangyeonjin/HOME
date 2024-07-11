package com.yeonjin.section02;

import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

@WebServlet(value = "/annotation-lifecycle")
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
