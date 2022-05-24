package com.connectbackend.quanLyBenhAn.service.Imp;

import com.connectbackend.quanLyBenhAn.entity.BenhAn;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public interface IBenhAnService {
    Page<BenhAn> findAll(Pageable pageable);

    Page<BenhAn> findAllByBenhNhanId(Pageable pageable, Integer id);

    Page<BenhAn> findAllByName(Pageable pageable, String name);

    List<BenhAn> findAll();

    Optional<BenhAn> findById(Integer id);

    void update(BenhAn benhAn);

    void delete(Integer id);
}
