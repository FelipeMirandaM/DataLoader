package com.eve.project.dataloader.models;

public class Material {

    private int typeId;
    private String name;

    private int quantity;

    public Material() {
    }

    public Material(int typeId, String name, int quantity) {
        this.typeId = typeId;
        this.name = name;
        this.quantity = quantity;
    }

    public int getTypeId() {
        return typeId;
    }

    public void setTypeId(int typeId) {
        this.typeId = typeId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}
