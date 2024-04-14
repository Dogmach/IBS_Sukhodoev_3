package org.example.second;

public class Marmelade extends Sweets {
    private String taste;

    public Marmelade(String name, Double price, Integer weight, String taste) {
        super(name, price, weight);
        this.taste = taste;
    }

    public String getTaste() {
        return taste;
    }

    public void setTaste(String taste) {
        this.taste = taste;
    }

    @Override
    public String toString() {
        return "Мармелад [" + super.toString() + ", вкус: " + taste + "]";
    }
}