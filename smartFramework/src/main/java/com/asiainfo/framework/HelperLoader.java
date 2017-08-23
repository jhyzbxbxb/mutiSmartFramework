package com.asiainfo.framework;

import com.asiainfo.framework.helper.BeanHelper;
import com.asiainfo.framework.helper.ClassHelper;
import com.asiainfo.framework.helper.ControllerHelper;
import com.asiainfo.framework.helper.IocHelper;
import com.asiainfo.framework.util.ClassUtil;

/**
 * 加载相应的Helper类
 * Created by xubin on 2017/8/6.
 */
public final class HelperLoader {
    /**
     * 初始化助手类
     */
    public static void init(){
        Class<?>[] classList = {
                ClassHelper.class,
                BeanHelper.class,
                IocHelper.class,
                ControllerHelper.class
        };
        for (Class<?> cls:classList){
            ClassUtil.loadClass(cls.getName(),false);
        }
    }
}
