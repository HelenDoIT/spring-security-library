package com.library.biz.service.impl;

import com.library.biz.mapper.BookInfoMapper;
import com.library.common.domain.entity.BookInfo;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.mockito.Spy;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.verify;

/**
 * @description:
 * @author: Lai Haimeng
 * @date: 2023/12/13
 */
class BookServiceImplTest {

    @Mock
    private BookInfoMapper bookInfoMapper;
    @InjectMocks
    private BookServiceImpl bookService;


    @BeforeEach
    void setUp() {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    void listAll() {
        List<BookInfo> bookInfos = bookService.listAll();
        System.out.println(bookInfos);
        verify(bookInfoMapper).listAll();
    }
}