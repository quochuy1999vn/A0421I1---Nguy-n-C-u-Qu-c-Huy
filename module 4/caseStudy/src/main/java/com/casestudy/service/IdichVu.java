package com.casestudy.service;

import com.casestudy.entity.DichVu;

import java.util.List;
import java.util.Optional;
@org.springframework.stereotype.Service
public interface IdichVu {
    List<DichVu> findAll();

    Optional<DichVu> findById(String id);

    void save(DichVu dichVu);

    void remove(String id);
}
