package com.promotion.service.Impl;

import com.promotion.entity.Promotion;
import com.promotion.repository.IPromotionRepository;
import com.promotion.service.IPromotionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
public class PromotionService implements IPromotionService {

    @Autowired
    private IPromotionRepository promotionRepository;

    @Override
    public List<Promotion> findAll() {
        return promotionRepository.findAll();
    }

    @Override
    public Optional<Promotion> findById(int id) {
        return promotionRepository.findById(id);
    }

    @Override
    public void save(Promotion promotion) {
        promotionRepository.save(promotion);
    }

    @Override
    public void delete(int id) {
        promotionRepository.deleteById(id);
    }
}
