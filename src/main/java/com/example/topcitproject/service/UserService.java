package com.example.topcitproject.service;

import com.example.topcitproject.domain.entity.UserEntity;
import com.example.topcitproject.domain.repository.UserRepository;
import com.example.topcitproject.dto.UserDto;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;


@Service
@AllArgsConstructor
public class UserService {

    private UserRepository userRepository;


    @Transactional
    public List<UserDto> getUserlist() {
        List<UserEntity> userEntities = userRepository.findAll();
        List<UserDto> userDtoList = new ArrayList<>();

        for ( UserEntity userEntity : userEntities) {
            UserDto userDTO = UserDto.builder()
                    .id(userEntity.getId())
                    .text(userEntity.getText())
                    .text_pic(userEntity.getText_pic())
                    .answer(userEntity.getAnswer())
                    .answer_1w(userEntity.getAnswer_1w())
                    .answer_2w(userEntity.getAnswer_2w())
                    .answer_3w(userEntity.getAnswer_3w())
                    .answer_4w(userEntity.getAnswer_4w())
                    .avg(userEntity.getAvg())
                    .label(userEntity.getLabel())
                    .type(userEntity.getType())
                    .wrong(userEntity.getWrong())
                    .count(userEntity.getCount())
                    .point(userEntity.getPoint())
                    .build();

            userDtoList.add(userDTO);
        }

        return userDtoList;
    }

    @Transactional
    public UserDto getPost(Long id) {
        Optional<UserEntity> userEntityWrapper = userRepository.findById(id);
        UserEntity userEntity = userEntityWrapper.get();

        UserDto userDTO = UserDto.builder()
                .id(userEntity.getId())
                .text(userEntity.getText())
                .text_pic(userEntity.getText_pic())
                .answer(userEntity.getAnswer())
                .answer_1w(userEntity.getAnswer_1w())
                .answer_2w(userEntity.getAnswer_2w())
                .answer_3w(userEntity.getAnswer_3w())
                .answer_4w(userEntity.getAnswer_4w())
                .avg(userEntity.getAvg())
                .label(userEntity.getLabel())
                .type(userEntity.getType())
                .wrong(userEntity.getWrong())
                .count(userEntity.getCount())
                .point(userEntity.getPoint())
                .build();

        return userDTO;
    }

}
