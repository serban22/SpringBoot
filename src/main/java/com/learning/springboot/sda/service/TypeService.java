package com.learning.springboot.sda.service;

import com.learning.springboot.sda.entity.Type;
import com.learning.springboot.sda.repository.TypeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
public class TypeService {

    @Autowired
    TypeRepository typeRepository;

    @Transactional
    public Optional<Type> getTypeById(Integer id) {
        return typeRepository.findById(id);
    }

    @Transactional
    public Type saveType(Type type) {
        return typeRepository.save(type);
    }

    @Transactional
    public Type getEntityById(Integer id) {
        return typeRepository.getOne(id);
    }

    @Transactional
    public List<Type> getAllEntities() {
        return typeRepository.findAll();
    }
}
