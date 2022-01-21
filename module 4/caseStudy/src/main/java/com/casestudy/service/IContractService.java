package com.casestudy.service;

import com.casestudy.entity.Contract;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
public interface IContractService {
    List<Contract> findAll();

    Optional<Contract> findById(int id);

    void save(Contract  contract);

    void remove(int id);
}
