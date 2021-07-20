package com.example.testommorrow.model;

public class Model {
    private String model;
    private String year;
    private String specifications;
    private String color;
    private int id;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Model(){

    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public String getSpecifications() {
        return specifications;
    }

    public void setSpecifications(String specifications) {
        this.specifications = specifications;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Model(String model, String year, String specifications, String color) {
        this.model = model;
        this.year = year;
        this.specifications = specifications;
        this.color = color;
    }
}
