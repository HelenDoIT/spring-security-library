package com.library.api.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @description:
 * @author: Lai Haimeng
 * @date: 2023/12/13
 */
@RestController
public class BookController {

    @GetMapping("/book/list")
    public String listBooks(){
        return "List books";
    }
}
