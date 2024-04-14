package org.example.second;

public abstract class Sweets {
    private String name;
    private Double price;
    private Integer weight;

    public Sweets(String name, Double price, Integer weight) {
        this.name = name;
        this.price = price;
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Integer getWeight() {
        return weight;
    }

    public void setWeight(Integer weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Марка: " + name + ", цена: " + price + " руб." + ", вес: " + weight + " гр.";
    }
}