package com.bridgelabz.fundoonotes.controller;

import com.bridgelabz.fundoonotes.dto.UserDTO;
import com.bridgelabz.fundoonotes.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/user")
public class UserController {

    @Autowired
    private UserService service;

    @PostMapping("/register")
    public String register(@RequestBody UserDTO dto) {
        return service.register(dto);
    }

    @PostMapping("/login")
    public String login(@RequestBody UserDTO dto) {
        return service.login(dto);
    }
}
