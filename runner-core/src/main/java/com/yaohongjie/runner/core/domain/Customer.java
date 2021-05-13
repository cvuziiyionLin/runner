package com.yaohongjie.runner.core.domain;

import lombok.Data;

import javax.persistence.*;
import java.util.Date;

/**
 * 顾客（配送员）实体类
 */
@Entity
@Data
@Table(name = "at_customer")
public class Customer {

    @Id
    @GeneratedValue
    private Long id;

    //用户名
    @Column(length = 50, unique = true)
    private String username;

    //昵称
    @Column(length = 50)
    private String nickname;
    // 密码
    @Column(length = 50)
    private String password;

    // 员工类型（1：普通顾客，2：配送员）
    private Integer type = 1;

    private Integer applyStatus = 0;//申请状态（0：默认没有申请，1：申请中，2：通过申请，9：不通过）
    // 手机号码
    @Column(length = 50)
    private String mobile;

    //用户名、昵称、密码、用户类型（1：普通顾客，2：配送员）、手机号码、注册日期

    @Temporal(value = TemporalType.TIMESTAMP)
    private Date registTime;

    private Integer status = 1;//数据状态(-1:删除，0：禁用，1：正常),状态删除标识

    //构造函数
    //无参数的构造函数(规定动作)
    public Customer(){}

    public Customer(Long id){
        this.id = id;
    }
}
