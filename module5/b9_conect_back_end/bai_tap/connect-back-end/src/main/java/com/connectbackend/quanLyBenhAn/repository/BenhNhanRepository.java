package com.connectbackend.quanLyBenhAn.repository;

import com.connectbackend.quanLyBenhAn.entity.BenhNhan;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BenhNhanRepository extends JpaRepository<BenhNhan, Integer> {
}
