package com.example.topcitproject.domain.repository;

import com.example.topcitproject.domain.entity.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<UserEntity, Long> {



}
