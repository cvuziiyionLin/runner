package com.yaohongjie.runner.core.domain;

import lombok.Data;

import javax.persistence.*;

/**
 * 系统管理员实体类
 */
@Entity
@Data
@Table(name = "at_manager")
public class Manager {

    @Id
    @GeneratedValue
    private Long id;
    @Column(length = 50, unique = true)
    private String username;

    @Column(length = 50)
    private String nickname;

    @Column(length = 50)
    private String password;
    @Column(length = 50)
    private String mobile;

    private Integer status;

    public Manager(){}

    public Manager(Long id){
        this.id = id;
    }
}
