package com.vasiliskardaras.authorizationserver;

import java.security.Principal;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {

    @GetMapping("/")
    public String hello() {
        return "Welcome!";
    }

    @GetMapping("/user")
    public Principal user(Principal user) {
        return user;
    }
}
