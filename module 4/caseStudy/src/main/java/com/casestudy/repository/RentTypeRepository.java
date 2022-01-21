package com.casestudy.repository;

import com.casestudy.entity.Rent_type;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RentTypeRepository extends JpaRepository<Rent_type, Integer> {
}
