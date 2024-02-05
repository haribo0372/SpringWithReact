package com.example.demo.controller;

import com.example.demo.models.User;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.List;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
@RequestMapping("/example")
public class FirstController {
    @GetMapping("/list")
    public List<User> getList(){
        return Arrays.asList(new User("Roma", 13), new User("ALBLAK", 52));
    }
}
