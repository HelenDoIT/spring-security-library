package com.library.common.domain.entity;

import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

/**
 * @description:
 * @author: Lai Haimeng
 * @date: 2023/12/13
 */
@Getter@Setter
public class UserInfo implements Serializable {

    private Long userId;
    private String name;
    private String password;
    private String role;

    public UserInfo(){

    }

    public UserInfo(String name, String password, String role) {
        this.name = name;
        this.password = password;
        this.role = role;
    }

    public UserInfo(Long userId, String name, String password, String role) {
        this(name,password,role);
        this.userId = userId;
    }

}
