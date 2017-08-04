package com.asiainfo.smart.service;

import com.asiainfo.smart.model.Customer;

import java.util.List;
import java.util.Map;

/**
 * Created by xubin on 2017/8/2.
 */
public interface CustomerService {
    /**
     * 获取客户列表
     * @param keyword
     * @return
     */
    public List<Customer> getCustomerList(String keyword);

    /**
     * 获取客户
     * @param id
     * @return
     */
    public Customer getCustmoer(long id);

    /**
     * 创建客户
     * @param fieldMap
     * @return
     */
    public boolean createCustomer(Map<String, Object> fieldMap);

    /**
     * 更新客户
     * @param id
     * @param filedMap
     * @return
     */
    public boolean updateCustomer(long id, Map<String, Object> filedMap);

    /**
     * 删除客户
     * @param id
     * @return
     */
    public boolean deleteCustomer(long id);
}
