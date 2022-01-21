package com.casestudy.repository;

import com.casestudy.entity.Service_type;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ServiceTypeRepository extends JpaRepository<Service_type, Integer> {
}
