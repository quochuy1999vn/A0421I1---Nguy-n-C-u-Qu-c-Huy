package com.casestudy.service.Impl;

import com.casestudy.entity.DichVu;
import com.casestudy.repository.IServiceRepository;
import com.casestudy.service.IdichVu;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
public class dichVu implements IdichVu {

    @Autowired
    private IServiceRepository serviceRepository;

    @Override
    public List<DichVu> findAll() {
        return serviceRepository.findAll();
    }

    @Override
    public Optional<DichVu> findById(String id) {
        return serviceRepository.findById(Integer.valueOf(id));
    }

    @Override
    public void save(DichVu dichVu) {
        serviceRepository.save(dichVu);
    }

    @Override
    public void remove(String id) {
        serviceRepository.deleteById(Integer.valueOf(id));
    }
}
