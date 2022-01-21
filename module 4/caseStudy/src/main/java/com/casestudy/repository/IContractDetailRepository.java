package com.casestudy.repository;

import com.casestudy.entity.Contract_detail;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IContractDetailRepository extends JpaRepository<Contract_detail, Integer> {
}
