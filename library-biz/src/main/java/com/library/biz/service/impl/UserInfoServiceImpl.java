package com.library.biz.service.impl;

import com.library.common.domain.entity.UserInfo;
import com.library.biz.mapper.UserInfoMapper;
import com.library.biz.service.IUserInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @description:
 * @author: Lai Haimeng
 * @date: 2023/12/13
 */
@Service
public class UserInfoServiceImpl implements IUserInfoService {

    @Autowired
    private UserInfoMapper userInfoMapper;

    @Override
    public UserInfo getUserByName(String userName) {
        UserInfo userInfo = userInfoMapper.getUserByName(userName);
        return userInfo;
    }
}
