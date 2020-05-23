package com.learning.springboot.sda.service;

import com.learning.springboot.sda.entity.Status;
import com.learning.springboot.sda.repository.StatusRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
public class StatusService {

    @Autowired
    StatusRepository statusRepository;

    @Transactional
    public Optional<Status> getStatusById(Integer id) {
        return statusRepository.findById(id);
    }

    @Transactional
    public Status saveStatus(Status status) {
        return statusRepository.save(status);
    }

    @Transactional
    public Status getEntityById(Integer id) {
        return statusRepository.getOne(id);
    }

    @Transactional
    public List<Status> getAllEntities() {
        return statusRepository.findAll();
    }
}
