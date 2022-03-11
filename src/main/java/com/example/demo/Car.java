package com.example.demo;

public class Car {
    private Integer id;
    private String type;
    private String color;

    public Car(Integer id, String type, String color) {
        this.id = id;
        this.type = type;
        this.color = color;
    }

    public Car() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

}
