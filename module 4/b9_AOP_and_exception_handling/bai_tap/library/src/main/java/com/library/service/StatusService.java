package com.library.service;

import com.library.model.Status;
import com.library.repository.IStatusRepository;
import org.springframework.beans.factory.annotation.Autowired;

public class StatusService implements IStatusService{

    @Autowired
    private IStatusRepository statusRepository;
    @Override
    public void createStatus() {
        statusRepository.save(new Status(1, "available"));
        statusRepository.save(new Status(2, "used"));
    }
}
