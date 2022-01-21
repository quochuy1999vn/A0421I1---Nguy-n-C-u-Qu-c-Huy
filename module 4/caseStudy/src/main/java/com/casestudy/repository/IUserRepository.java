package com.casestudy.repository;

import com.casestudy.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IUserRepository extends JpaRepository<User, Long> {
    User findUserByUsername(String username);
}
