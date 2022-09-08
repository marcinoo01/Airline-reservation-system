package com.mmistela.auth.jwt.exception;

import java.util.Set;

public interface RegisteredUser {

    String getUsername();

    Set<String> getAuthorities();
}
