package com.example.topcitproject.service;

import com.example.topcitproject.domain.entity.UserEntity;
import com.example.topcitproject.domain.entity.UserEntity2;
import com.example.topcitproject.domain.repository.UserRepository;
import com.example.topcitproject.domain.repository.UserRepository2;
import com.example.topcitproject.dto.UserDto;
import com.example.topcitproject.dto.UserDto2;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;


@Service
@AllArgsConstructor
public class UserService2 {

    private UserRepository2 userRepository2;

    @Transactional
    public List<UserDto2> getQuetionlist2() {
        List<UserEntity2> userEntities2 = userRepository2.findAll();
        List<UserDto2> userDtoList2 = new ArrayList<>();

        for ( UserEntity2 userEntity2 : userEntities2) {
            UserDto2 userDTO2 = UserDto2.builder()
                    .id(userEntity2.getId())
                    .text(userEntity2.getText())
                    .text_pic(userEntity2.getText_pic())
                    .answer(userEntity2.getAnswer())
                    .answer_1w(userEntity2.getAnswer_1w())
                    .answer_2w(userEntity2.getAnswer_2w())
                    .answer_3w(userEntity2.getAnswer_3w())
                    .answer_4w(userEntity2.getAnswer_4w())
                    .avg(userEntity2.getAvg())
                    .label(userEntity2.getLabel())
                    .type(userEntity2.getType())
                    .wrong(userEntity2.getWrong())
                    .count(userEntity2.getCount())
                    .point(userEntity2.getPoint())
                    .build();

            userDtoList2.add(userDTO2);
        }

        return userDtoList2;
    }

    @Transactional
    public UserDto2 getQuetion2(Long id) {
        Optional<UserEntity2> userEntityWrapper2 = userRepository2.findById(id);
        UserEntity2 userEntity2 = userEntityWrapper2.get();

        UserDto2 userDTO2 = UserDto2.builder()
                .id(userEntity2.getId())
                .text(userEntity2.getText())
                .text_pic(userEntity2.getText_pic())
                .answer(userEntity2.getAnswer())
                .answer_1w(userEntity2.getAnswer_1w())
                .answer_2w(userEntity2.getAnswer_2w())
                .answer_3w(userEntity2.getAnswer_3w())
                .answer_4w(userEntity2.getAnswer_4w())
                .avg(userEntity2.getAvg())
                .label(userEntity2.getLabel())
                .type(userEntity2.getType())
                .wrong(userEntity2.getWrong())
                .count(userEntity2.getCount())
                .point(userEntity2.getPoint())
                .build();

        return userDTO2;
    }

}
