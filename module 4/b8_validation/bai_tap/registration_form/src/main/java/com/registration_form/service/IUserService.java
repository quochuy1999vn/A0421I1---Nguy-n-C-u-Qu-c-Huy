package com.registration_form.service;

import com.registration_form.entity.User;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public interface IUserService {
    List<User> findAll();

    void save(User user);

    Optional<User> findById(Long id);

    void delete(Long id);


}
