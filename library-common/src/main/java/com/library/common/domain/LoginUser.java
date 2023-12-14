package com.library.common.domain;

import com.library.common.domain.entity.UserInfo;
import lombok.Getter;
import lombok.Setter;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.Collection;
import java.util.Set;

/**
 * @description:
 * @author: Lai Haimeng
 * @date: 2023/12/13
 */
@Getter@Setter
public class LoginUser implements UserDetails {

    /**
     * 用户ID
     */
    private Long userId;

    /**
     * 角色
     */
    private String role;

    /**
     * 用户唯一标识
     */
    private String token;
    /**
     * 权限列表
     */
    private Set<String> permissions;

    /**
     * 用戶信息
     */
    private UserInfo user;

    public LoginUser(Long userId, String role, UserInfo user,Set<String> permissions) {
        this.userId = userId;
        this.role = role;
        this.user = user;
        this.permissions = permissions;
    }

    public LoginUser(Long userId, String role, String token, Set<String> permissions, UserInfo user) {
        this(userId,role,user,permissions);
        this.token = token;
    }

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        return null;
    }

    @Override
    public String getPassword() {
        return user.getPassword();
    }

    @Override
    public String getUsername() {
        return user.getName();
    }

    @Override
    public boolean isAccountNonExpired() {
        return true;
    }

    @Override
    public boolean isAccountNonLocked() {
        return true;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return true;
    }

    @Override
    public boolean isEnabled() {
        return true;
    }
}
