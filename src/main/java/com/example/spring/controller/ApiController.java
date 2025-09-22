package com.example.spring.controller;


import com.example.spring.model.UserData;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ApiController {

    @GetMapping("/api")
    public String sayhello(){
        return "hello world";
    }

    @PostMapping("/api")
    public UserData getData(@RequestBody UserData user){
        UserData cur = new UserData();
        cur.setName(user.getName());
        cur.setMsg(user.getMsg() + " This is a post msg");
        return cur;
    }
}
