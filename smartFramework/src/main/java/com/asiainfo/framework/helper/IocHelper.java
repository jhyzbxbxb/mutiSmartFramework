package com.asiainfo.framework.helper;

import com.asiainfo.framework.annotation.Inject;
import com.asiainfo.framework.util.ArrayUtil;
import com.asiainfo.framework.util.CollectionUtil;
import com.asiainfo.framework.util.ReflectionUtil;

import java.lang.reflect.Field;
import java.util.Map;

/**
 * 依赖注入助手类
 * Created by xubin on 2017/8/5.
 */
public final class IocHelper {

    static {
        //获取所有的Bean类与Bean实例之间的映射关系（简称 Bean Map）
        Map<Class<?>, Object> beanMap = BeanHelper.getBeanMap();
        if (CollectionUtil.isNotEmpty(beanMap)) {
            //遍历Bean Map
            for (Map.Entry<Class<?>, Object> beanEntry : beanMap.entrySet()) {
                //从BeanMap中获取Bean类与Bean实例
                Class<?> beanClass = beanEntry.getKey();
                Object beanInstance = beanEntry.getValue();
                //获取Bean定义类的所有成员变量
                Field[] beanFields = beanClass.getDeclaredFields();
                if (ArrayUtil.isNotEmpty(beanFields)) {
                    //遍历Bean Field
                    for (Field beanField : beanFields) {
                        //判断当前beanField是否带有Inject注解
                        if (beanField.isAnnotationPresent(Inject.class)) {
                            //在Bean Map中获取对应的实例
                            Class<?> beanFieldClass = beanField.getType();
                            Object beanFieldInstance = beanMap.get(beanClass);
                            if (beanFieldInstance != null) {
                                //通过反射初始化beanField值
                                ReflectionUtil.setField(beanInstance, beanField, beanFieldInstance);
                            }
                        }
                    }

                }
            }
        }
    }
}
