package com.library.biz.mapper;

import com.library.common.domain.entity.BookInfo;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.MockitoAnnotations;
import org.mockito.Spy;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @description:
 * @author: Lai Haimeng
 * @date: 2023/12/13
 */
class BookInfoMapperTest {

    @Spy
    private BookInfoMapper bookInfoMapper;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    void listAll() {
        List<BookInfo> bookInfos = bookInfoMapper.listAll();
        System.out.println(bookInfos);
    }
}