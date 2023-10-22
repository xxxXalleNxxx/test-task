package ru.arapov.testtask.controllers;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/user")
@CrossOrigin("*")
public class UserController {

    @GetMapping("/")
    public String helloUser() {
        return "Hello user";
    }
}
