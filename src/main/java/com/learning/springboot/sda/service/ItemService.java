package com.learning.springboot.sda.service;

import com.learning.springboot.sda.entity.Item;
import com.learning.springboot.sda.repository.ItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
public class ItemService {

    @Autowired
    ItemRepository itemRepository;

    @Transactional
    public Optional<Item> getItemById(Integer id) {
        return itemRepository.findById(id);
    }

    @Transactional
    public Item saveItem(Item item) {
        return itemRepository.save(item);
    }

    @Transactional
    public Item getEntityById(Integer id) {
        return itemRepository.getOne(id);
    }

    @Transactional
    public List<Item> getAllEntities() {
        return itemRepository.findAll();
    }

}
