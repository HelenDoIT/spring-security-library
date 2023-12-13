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
public class BookInfo implements Serializable {

    private Long bookId;
    private String name;
    private String author;
    private int inventory;
    private int dr;

    public BookInfo(){

    }

    public BookInfo(Long bookId, String name, String author, int inventory) {
        this.bookId = bookId;
        this.name = name;
        this.author = author;
        this.inventory = inventory;
    }


}
