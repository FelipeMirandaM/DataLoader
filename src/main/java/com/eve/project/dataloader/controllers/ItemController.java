package com.eve.project.dataloader.controllers;

import com.eve.project.dataloader.services.ItemService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ItemController {


    private ItemService itemService;

    public ItemController(ItemService itemService) {
        this.itemService = itemService;
    }

    @GetMapping("/load")
    public void loadData() {
        itemService.loadData();
    }

}
