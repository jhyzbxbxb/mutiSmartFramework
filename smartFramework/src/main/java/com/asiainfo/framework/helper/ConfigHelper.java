package com.asiainfo.framework.helper;

import com.asiainfo.framework.ConfigConstant;
import com.asiainfo.framework.util.PropsUtil;

import java.util.Properties;

/**
 * 属性文件助手类
 * Created by xubin on 2017/8/3.
 */
public class ConfigHelper {

    private static final Properties CONFIG_PROPS = PropsUtil.loadProps(ConfigConstant.CONFIG_FILE);

    /**
     * 获取JDBC驱动
     * @return
     */
    public static String getJdbcDriver(){
        return PropsUtil.getString(CONFIG_PROPS,ConfigConstant.JDBC_DRIVER);
    }

    /**
     * 获取JDBC URL
     * @return
     */
    public static String getJdbcUrl(){
        return PropsUtil.getString(CONFIG_PROPS,ConfigConstant.JDBC_URL);
    }

    /**
     * 获取JDBC用户名
     * @return
     */
    public static String getJdbcUsername(){
        return PropsUtil.getString(CONFIG_PROPS,ConfigConstant.JDBC_USERNAME);
    }

    /**
     * 获取JDBC密码
     * @return
     */
    public static String getJdbcPassword() {return PropsUtil.getString(CONFIG_PROPS,ConfigConstant.JDBC_PASSWORD);}

    /**
     * 获取应用基础包名
     * @return
     */
    public static String getAppBasePackage(){return PropsUtil.getString(CONFIG_PROPS,ConfigConstant.APP_BASE_PACKAGE);}

    /**
     * 获取应用jsp路径
     * @return
     */
    public static String getAppJspPath(){return PropsUtil.getString(CONFIG_PROPS,ConfigConstant.APP_JSP_PATH);}

    /**
     * 获取应用静态资源路径
     * @return
     */
    public static String getAppAssetPath(){return PropsUtil.getString(CONFIG_PROPS,ConfigConstant.APP_ASSET_PATH);}
}
