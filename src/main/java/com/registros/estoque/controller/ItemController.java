package com.registros.estoque.controller;

import com.registros.estoque.model.Item;
import com.registros.estoque.repository.ItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/item")
public class ItemController {

    @Autowired
    private ItemRepository repository;

    @GetMapping
    public List<Item> getAll(){

        List<Item> ItemList = repository.findAll();
        return ItemList;
    }


}
