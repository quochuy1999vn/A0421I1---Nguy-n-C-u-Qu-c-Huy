package com.phone_manager.service;

import com.phone_manager.entity.SmartPhone;

import java.util.Optional;

public interface ISmartPhoneService {
    Iterable<SmartPhone> findAll();

    Optional<SmartPhone> findById(Long id);

    SmartPhone save(SmartPhone smartPhone);

    void remove(Long id);
}
