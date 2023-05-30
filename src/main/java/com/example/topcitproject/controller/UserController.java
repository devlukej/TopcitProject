package com.example.topcitproject.controller;

import com.example.topcitproject.dto.UserDto;
import com.example.topcitproject.dto.UserDto2;
import com.example.topcitproject.service.UserService;
import com.example.topcitproject.service.UserService2;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


@Controller
@AllArgsConstructor
public class UserController {
    private UserService userService;
    private UserService2 userService2;


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
        UserDto userDTO = userService.getQuetion(no);

        List<String> answerList = new ArrayList<>();
        answerList.add(userDTO.answer_1w);
        answerList.add(userDTO.answer_2w);
        answerList.add(userDTO.answer_3w);
        answerList.add(userDTO.answer_4w);

        Collections.shuffle(answerList);

        model.addAttribute("answerList", answerList);
        model.addAttribute("userDto", userDTO);
        return "obo/oboQ";
    }

    @GetMapping("/obo/answer/{no}")
    public String oboA(@PathVariable("no") Long no, Model model) {
        UserDto userDTO = userService.getQuetion(no);

        model.addAttribute("userDto", userDTO);
        return "obo/oboA";
    }

    @GetMapping("/test")
    public String test(Model model) {

        List<UserDto> userDtoList = userService.getQuetionlist();
        List<UserDto2> userDtoList2 = userService2.getQuetionlist2();

        model.addAttribute("userDtoList", userDtoList);
        model.addAttribute("userDtoList2", userDtoList2);
        return "test/test";
    }

    @GetMapping("/wrong")
    public String wrong() {

        return "wrong/wrong";
    }

    @GetMapping("/wrong/detail")
    public String wrongDetail() {

        return "wrong/wrongDetail";
    }

}
