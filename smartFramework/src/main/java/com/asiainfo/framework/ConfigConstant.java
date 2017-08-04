package com.asiainfo.framework;

/**
 * Created by xubin on 2017/8/3.
 */
public interface ConfigConstant {
    /**
     * 配置文件名称
     */
    String CONFIG_FILE = "smart.properties";
    /**
     * 数据库驱动
     */
    String JDBC_DRIVER = "smart.framework.jdbc.driver";
    /**
     * 数据库地址
     */
    String JDBC_URL = "smart.framework.jdbc.url";
    /**
     * 数据库用户名
     */
    String JDBC_USERNAME = "smart.framework.jdbc.username";
    /**
     * 数据库密码
     */
    String JDBC_PASSWORD = "smart.framework.jdbc.password";
    /**
     * 基础包名
     */
    String APP_BASE_PACKAGE = "smart.framework.app.base_package";
    /**
     * JSP基础路径
     */
    String APP_JSP_PATH = "smart.framework.app.jsp_path";
    /**
     * 静态资源文件基础路径
     */
    String APP_ASSET_PATH = "smart.framework.app.asset_path";
}
