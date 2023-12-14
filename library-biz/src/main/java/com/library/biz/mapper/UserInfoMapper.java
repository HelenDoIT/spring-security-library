package com.library.biz.mapper;

import com.library.common.domain.entity.UserInfo;
import org.apache.ibatis.annotations.Param;

/**
 * @description:
 * @author: Lai Haimeng
 * @date: 2023/12/13
 */
public interface UserInfoMapper {

    UserInfo getUserByName(@Param("userName") String userName);
}
