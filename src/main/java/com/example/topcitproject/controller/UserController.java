package com.example.topcitproject.controller;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
@AllArgsConstructor
public class UserController {

    @GetMapping("/")
    public String main() {

        return "board/main";
    }

    @GetMapping("/obo")
    public String obo() {

        return "obo/obo";
    }

    @GetMapping("/obo/question")
    public String oboQ() {

        return "obo/oboQ";
    }

    @GetMapping("/obo/answer")
    public String oboA() {

        return "obo/oboA";
    }

    @GetMapping("/test")
    public String test() {

        return "test/test";
    }



}
