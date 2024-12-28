package com.example.recview;

public class Catagory {
    private String name;
    private String imgCatagory;

    public Catagory(String name, String imgCatagory) {
        this.name = name;
        this.imgCatagory = imgCatagory;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getImgCatagory() {
        return imgCatagory;
    }

    public void setImgCatagory(String imgCatagory) {
        this.imgCatagory = imgCatagory;
    }
}
