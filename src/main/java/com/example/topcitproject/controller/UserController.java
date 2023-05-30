package com.example.topcitproject.controller;

import com.example.topcitproject.dto.UserDto;
import com.example.topcitproject.service.UserService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;


@Controller
@AllArgsConstructor
public class UserController {
    private UserService userService;


    @GetMapping("/")
    public String main() {

        return "board/main";
    }

    @GetMapping("/obo")
    public String obo() {

        return "obo/obo";
    }

    @GetMapping("/obo/question/{no}")
    public String oboQ(@PathVariable("no") Long no, Model model) {
        UserDto userDTO = userService.getPost(no);

        model.addAttribute("userDto", userDTO);
        return "obo/oboQ";
    }

    @GetMapping("/obo/answer/{no}")
    public String oboA(@PathVariable("no") Long no, Model model) {
        UserDto userDTO = userService.getPost(no);

        model.addAttribute("userDto", userDTO);
        return "obo/oboA";
    }

    @GetMapping("/test")
    public String test() {

        return "test/test";
    }

    @GetMapping("/wrong")
    public String wrong() {

        return "wrong/wrong";
    }
}
