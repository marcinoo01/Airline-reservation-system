package com.mmistela.entity;

import org.springframework.security.core.GrantedAuthority;

public enum Role implements GrantedAuthority {
    ADMIN,
    CLIENT;

    @Override
    public String getAuthority() {
        return null;
    }
}
