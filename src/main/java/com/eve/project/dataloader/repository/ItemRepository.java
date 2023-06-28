package com.eve.project.dataloader.repository;

import com.eve.project.dataloader.models.Item;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ItemRepository extends MongoRepository<Item,String> {
}
