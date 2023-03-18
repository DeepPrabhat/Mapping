package com.example.mappings.services;

import com.example.mappings.models.Items;
import com.example.mappings.repositories.ItemRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class ItemService{

    final private ItemRepository itemRepository;

    public Items addItems(Items item){
        return itemRepository.save(item);
    }

    public List<Items> showAllItems(){
        return itemRepository.findAll();
    }
}

