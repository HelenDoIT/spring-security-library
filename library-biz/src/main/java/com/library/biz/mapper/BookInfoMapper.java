package com.library.biz.mapper;

import com.library.common.domain.entity.BookInfo;

import java.util.List;

/**
 * @description:
 * @author: Lai Haimeng
 * @date: 2023/12/13
 */
public interface BookInfoMapper {

    List<BookInfo> listAll();
}
