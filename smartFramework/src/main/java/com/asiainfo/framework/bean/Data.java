package com.asiainfo.framework.bean;

/**
 * 返回数据对象
 * Created by xubin on 2017/8/12.
 */
public class Data {
    /**
     * 模型数据
     */
    private Object model;

    public Data(Object model){
        this.model = model;
    }

    public Object getModel(){
        return model;
    }
}
