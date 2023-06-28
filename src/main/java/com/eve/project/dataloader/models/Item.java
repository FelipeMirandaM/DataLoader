package com.eve.project.dataloader.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.io.Serializable;
import java.util.List;


@Document
public class Item implements Serializable {



    @Id
    @JsonProperty("typeId")
    private int typeId;


    private double volume;

    private String name;

    @JsonProperty("bpoInfo")
    private List<BpoInfo> itemName;


    public Item() {
    }

    public Item(int typeId, double volume, String name, List<BpoInfo> itemName) {
        this.typeId = typeId;
        this.volume = volume;
        this.name = name;
        this.itemName = itemName;
    }



    public int getTypeId() {
        return typeId;
    }

    public void setTypeId(int typeId) {
        this.typeId = typeId;
    }

    public double getVolume() {
        return volume;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public void setVolume(double volume) {
        this.volume = volume;
    }

    public List<BpoInfo> getItemName() {
        return itemName;
    }

    public void setItemName(List<BpoInfo> itemName) {
        this.itemName = itemName;
    }
}