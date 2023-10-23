package com.example.traditional.controller;

import com.example.traditional.domain.User;
import com.example.traditional.dto.post.UserPostDTO;
import org.springframework.stereotype.Controller;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class UserController {


    @GetMapping("/signup")
    public String signUp() {
        return "signup";
    }

    @GetMapping("/register")
    public String register(@Validated @RequestBody UserPostDTO) {

    }
}