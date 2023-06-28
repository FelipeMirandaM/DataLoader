package com.eve.project.dataloader.services;

import com.eve.project.dataloader.models.Item;
import com.eve.project.dataloader.repository.ItemRepository;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.List;


@Service
public class ItemService {

    public ItemRepository itemRepository;

    public ItemService(ItemRepository itemRepository) {
        this.itemRepository = itemRepository;
    }

    public void loadData(){

        RestTemplate restTemplate = new RestTemplate();
        ResponseEntity<List<Item>> response = restTemplate.exchange(
                "http://localhost:8080/bluePrint",
                HttpMethod.GET,
                null,
                new ParameterizedTypeReference<List<Item>>(){});
        List<Item> dataList = response.getBody();
        itemRepository.saveAll(dataList);
    }

}
