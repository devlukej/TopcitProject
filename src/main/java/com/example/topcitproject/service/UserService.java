package com.example.topcitproject.service;

import com.example.topcitproject.domain.repository.UserRepository;
import com.example.topcitproject.dto.UserDto;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


@Service
@AllArgsConstructor
public class UserService {

    private UserRepository userRepository;

}
