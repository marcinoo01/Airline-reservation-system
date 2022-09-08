package com.mmistela.auth.jwt.exception;

import lombok.RequiredArgsConstructor;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Component;

import java.util.Set;

@Component
@RequiredArgsConstructor
public class UserDetailsProvider implements UserDetailsService {

    private final UserService userService;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        RegisteredUser user = findBy(username);
        return new UserDetailsWrapper();
    }

    public RegisteredUser findUserByUsername(String username){
        return new RegisteredUser(){

            @Override
            public String getUsername() {
                return userService.getUsernameForRegistered(username).orElseThrow(AuthenticationException::new);
            }

            @Override
            public Set<String> getAuthorities() {
                return null;
            }
        }
    }
}
