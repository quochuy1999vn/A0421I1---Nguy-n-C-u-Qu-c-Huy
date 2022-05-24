package com.quanlybenhan.repository;

import com.quanlybenhan.entity.BenhAn;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BenhAnRepository extends JpaRepository<BenhAn, Integer> {
    Page<BenhAn> findAllByBenhNhanId(Pageable pageable, Integer id);
    Page<BenhAn> findAllByBaSiDieuTriContaining(Pageable pageable, String name);
}
