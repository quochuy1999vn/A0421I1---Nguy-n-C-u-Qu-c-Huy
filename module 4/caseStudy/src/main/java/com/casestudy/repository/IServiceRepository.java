package com.casestudy.repository;

import com.casestudy.entity.DichVu;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IServiceRepository extends JpaRepository<DichVu, Integer> {
}
