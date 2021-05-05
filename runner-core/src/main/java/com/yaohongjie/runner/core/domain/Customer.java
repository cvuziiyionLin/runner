package com.yaohongjie.runner.core.domain;


import javax.persistence.*;

/**
 * 顾客（配送员）实体类
 */
@Entity
@Table(name = "at_customer")
public class Customer {

    @Id
    @GeneratedValue
    private Long id;

    //    用户名
    @Column(length = 50)
    private String username;

    //    昵称
    @Column(length = 50)
    private String nickname;

    // 密码
    @Column(length = 50)
    private String password;

    // 员工类型（1：普通顾客，2：配送员）
    private Integer type = 1;
    // 手机号码
    @Column(length = 50)
    private String mobile;

    private Integer status = 1;//数据状态(-1:删除，0：禁用，1：正常)

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getNikicname() {
        return nickname;
    }

    public void setNikicname(String nikicname) {
        this.nickname = nikicname;
    }
}