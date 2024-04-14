package org.example.second;

public class Candy extends Sweets {
    private String colorOfChocolate;

    public Candy(String name, Double price, Integer weight, String colorOfChocolate) {
        super(name, price, weight);
        this.colorOfChocolate = colorOfChocolate;
    }

    public String getColorOfChocolate() {
        return colorOfChocolate;
    }

    public void setColorOfChocolate(String colorOfChocolate) {
        this.colorOfChocolate = colorOfChocolate;
    }

    @Override
    public String toString() {
        return "Конфеты [" + super.toString() + ", тип шоколада: " + colorOfChocolate + "]";
    }
}
