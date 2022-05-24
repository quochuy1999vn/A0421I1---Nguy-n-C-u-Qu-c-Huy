package com.quanlybenhan.service.Imp;

import com.quanlybenhan.entity.BenhAn;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public interface IBenhAnService {

    List<BenhAn> findAll();

    Page<BenhAn> findAll(Pageable pageable);

    Page<BenhAn> findAllByBenhNhanId(Pageable pageable, Integer id);

    Page<BenhAn> findAllByName(Pageable pageable, String name);

    BenhAn save(BenhAn benhAn);

    void remove(int id);

    Optional<BenhAn> findById(Integer id);
}
