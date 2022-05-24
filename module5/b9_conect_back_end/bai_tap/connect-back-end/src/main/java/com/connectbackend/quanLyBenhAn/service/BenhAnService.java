package com.connectbackend.quanLyBenhAn.service;

import com.connectbackend.quanLyBenhAn.entity.BenhAn;
import com.connectbackend.quanLyBenhAn.repository.BenhAnRepository;
import com.connectbackend.quanLyBenhAn.service.Imp.IBenhAnService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class BenhAnService implements IBenhAnService {

    @Autowired
    private BenhAnRepository benhAnRepository;

    @Override
    public Page<BenhAn> findAll(Pageable pageable) {
        return benhAnRepository.findAll(pageable);
    }

    @Override
    public Page<BenhAn> findAllByBenhNhanId(Pageable pageable, Integer id) {
        return benhAnRepository.findAllByBenhNhanId(pageable, id);
    }

    @Override
    public Page<BenhAn> findAllByName(Pageable pageable, String name) {
        return benhAnRepository.findAllByBaSiDieuTriContaining(pageable, name);
    }

    @Override
    public List<BenhAn> findAll() {
        return benhAnRepository.findAll();
    }

    @Override
    public Optional<BenhAn> findById(Integer id) {
        return benhAnRepository.findById(id);
    }

    @Override
    public void update(BenhAn benhAn) {
        benhAnRepository.save(benhAn);
    }

    @Override
    public void delete(Integer id) {
        benhAnRepository.deleteById(id);
    }
}
