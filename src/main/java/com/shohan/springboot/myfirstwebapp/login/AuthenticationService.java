package com.shohan.springboot.myfirstwebapp.login;

import org.springframework.stereotype.Service;

@Service
public class AuthenticationService {
    public boolean authenticate(String username, String password) {
        boolean isValidUserName = username.equalsIgnoreCase("mjashohan");
        boolean isValidPassword = password.equalsIgnoreCase("sara");

        return isValidUserName && isValidPassword;
    }
}
