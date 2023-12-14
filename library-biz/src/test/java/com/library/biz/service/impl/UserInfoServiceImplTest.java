package com.library.biz.service.impl;

import com.library.biz.mapper.UserInfoMapper;
import com.library.common.domain.entity.UserInfo;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.*;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;

/**
 * @description:
 * @author: Lai Haimeng
 * @date: 2023/12/13
 */
class UserInfoServiceImplTest {

    @Mock
    private UserInfoMapper userInfoMapper;
    @InjectMocks
    private UserInfoServiceImpl userInfoService;
    @Captor
    private ArgumentCaptor<UserInfo> argumentCaptor;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    void getUserByName() {
        UserInfo userInfo = new UserInfo("user","password","USER");
        when(userInfoMapper.getUserByName(anyString())).thenReturn(userInfo);
        UserInfo user = userInfoService.getUserByName("admin");
        verify(userInfoMapper).getUserByName("admin");
        assertEquals(user.getName(),"user");
    }
}