package com.example.lab3.controller;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.lab3.bai1.ParamService;
import com.example.lab3.entity.Item;

public interface ShoppingCartService {
    Item add(Integer id);
    void remove(Integer id);
    Item update(Integer id, int qty);
    void clear();
    Collection<Item> getItems();
    int getCount();
    double getAmount();
}

