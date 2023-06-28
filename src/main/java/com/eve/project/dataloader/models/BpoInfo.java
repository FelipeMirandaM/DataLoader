package com.eve.project.dataloader.models;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public class BpoInfo {

    private int typeId;

    private String name;

    @JsonProperty("OutPutQuantity")
    private int outPutQuantity;

    private List<Material> materialList;

    public BpoInfo() {
    }

    public BpoInfo(int typeId, String name, int outPutQuantity, List<Material> materialList) {
        this.typeId = typeId;
        this.name = name;
        this.outPutQuantity = outPutQuantity;
        this.materialList = materialList;
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

    public int getOutPutQuantity() {
        return outPutQuantity;
    }

    public void setOutPutQuantity(int outPutQuantity) {
        this.outPutQuantity = outPutQuantity;
    }

    public List<Material> getMaterialList() {
        return materialList;
    }

    public void setMaterialList(List<Material> materialList) {
        this.materialList = materialList;
    }
}
