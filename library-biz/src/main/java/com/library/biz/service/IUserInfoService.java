package com.library.biz.service;

import com.library.common.domain.entity.UserInfo;

/**
 * @description:
 * @author: Lai Haimeng
 * @date: 2023/12/13
 */
public interface IUserInfoService {

    UserInfo getUserByName(String userName);
}
