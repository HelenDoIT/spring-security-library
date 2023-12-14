package com.library.biz.service.impl;

import com.library.biz.mapper.BookInfoMapper;
import com.library.biz.service.IBookInfoService;
import com.library.common.domain.entity.BookInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @description:
 * @author: Lai Haimeng
 * @date: 2023/12/13
 */
@Service
public class BookServiceImpl implements IBookInfoService {

    @Autowired
    private BookInfoMapper bookInfoMapper;

    @Override
    public List<BookInfo> listAll() {
        List<BookInfo> bookInfos = bookInfoMapper.listAll();
        return bookInfos;
    }
}
