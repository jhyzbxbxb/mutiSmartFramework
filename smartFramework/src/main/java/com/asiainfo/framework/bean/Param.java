package com.asiainfo.framework.bean;

import com.asiainfo.framework.util.CastUtil;

import java.util.Map;

/**
 * Created by xubin on 2017/8/12.
 */
public class Param {

    private Map<String,Object> paramMap;

    public Param(Map<String,Object> paramMap){
        this.paramMap = paramMap;
    }

    /**
     * 根据参数名获取long型参数
     * @param name
     * @return
     */
    public long getLong(String name){
        return CastUtil.castLong(paramMap.get(name));
    }

    /**
     * 获取所有字段信息
     * @return
     */
    public Map<String,Object> getMap(){
        return paramMap;
    }

}
