package com.asiainfo.smart.service.impl;


import com.asiainfo.smart.model.Customer;
import com.asiainfo.smart.service.CustomerService;

import java.util.List;
import java.util.Map;

/**
 * Created by xubin on 2017/8/2.
 */
public class CustomerServiceImpl implements CustomerService {
    /**
     * 获取客户列表
     *
     * @param keyword
     * @return
     */
    @Override
    public List<Customer> getCustomerList(String keyword) {
        return null;
    }

    /**
     * 获取客户
     *
     * @param id
     * @return
     */
    @Override
    public Customer getCustmoer(long id) {
        return null;
    }

    /**
     * 创建客户
     *
     * @param fieldMap
     * @return
     */
    @Override
    public boolean createCustomer(Map<String, Object> fieldMap) {
        return false;
    }

    /**
     * 更新客户
     *
     * @param id
     * @param filedMap
     * @return
     */
    @Override
    public boolean updateCustomer(long id, Map<String, Object> filedMap) {
        return false;
    }

    /**
     * 删除客户
     *
     * @param id
     * @return
     */
    @Override
    public boolean deleteCustomer(long id) {
        return false;
    }
}
