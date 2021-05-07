package com.yaohongjie.runner.core.service;

import com.yaohongjie.runner.core.domain.Manager;

public interface ManagerService {

    //系统管理员服务类：登录、个人信息、密码修改

    /**
     * 登录
     * @param userName
     * @param password
     * @return
     */
    Manager login(String userName, String password);

    /**
     * 个人信息
     * @param id
     * @return
     */
    Manager get(Long id);

    /**
     * 密码修改
     * @param manager
     * @return
     */
    Manager modify(Manager manager);

}
