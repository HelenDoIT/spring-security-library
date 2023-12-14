package com.library.biz.service;

import com.library.common.domain.LoginUser;
import com.library.common.domain.entity.UserInfo;
import com.library.common.exception.ServiceException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

/**
 * @description:
 * @author: Lai Haimeng
 * @date: 2023/12/13
 */
@Service
public class UserDetailsServiceImpl implements UserDetailsService {

    private static final Logger log = LoggerFactory.getLogger(UserDetailsServiceImpl.class);

    @Autowired
    private IUserInfoService userInfoService;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        UserInfo userInfo = userInfoService.getUserByName(username);
        if(Objects.isNull(userInfo)){
            log.info("{}用戶不存在",username);
            throw new ServiceException("user not exist");
        }
        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
        UserInfo user = (UserInfo) authentication.getPrincipal();
        if(!validate(user.getPassword(),userInfo.getPassword())){
            throw new ServiceException("password error");
        }
        Set<String> permissions = new HashSet<>();
        if("admin".equals(userInfo.getRole())){
            permissions.add("admin");
        }else{
            permissions.add("user");
        }
        return new LoginUser(userInfo.getUserId(),userInfo.getRole(),userInfo,permissions);
    }

    private boolean validate(String authPassword, String password) {
        log.info("authPassword:{},password:{}",authPassword,password);
        BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();
        return encoder.matches(password,authPassword);
    }
}
