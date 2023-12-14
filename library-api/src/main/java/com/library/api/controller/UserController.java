package com.library.api.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @description:
 * @author: Lai Haimeng
 * @date: 2023/12/13
 */
@RestController
@RequestMapping("/user")
public class UserController {

    @GetMapping("/list")
    public String listUser(){
        return "listUser";
    }
}
