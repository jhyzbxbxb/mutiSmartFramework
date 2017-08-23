package com.asiainfo.framework;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;

/**
 * 请求转发器
 * Created by xubin on 2017/8/12.
 */
@WebServlet(urlPatterns = "/portal/smart/*",loadOnStartup = 0)
public class DispatcherServlet extends HttpServlet{

    @Override
    public void init(ServletConfig servletConfig) throws ServletException {
        //初始化相关Helper类
        HelperLoader.init();
        //获取ServletContext对象，用于注册Servlet
        ServletContext servletContext = servletConfig.getServletContext();
    }
}
