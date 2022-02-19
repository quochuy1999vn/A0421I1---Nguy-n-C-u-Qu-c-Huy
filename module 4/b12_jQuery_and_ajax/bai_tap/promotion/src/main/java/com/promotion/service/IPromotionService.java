package com.promotion.service;

import com.promotion.entity.Promotion;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public interface IPromotionService {
    List<Promotion> findAll();

    Optional<Promotion> findById(int id);

    void save(Promotion promotion);

    void delete(int id);
}
