package org.example.enums;

public enum Plan {
    BASIC("basic", 1000),
    MIDDLE("middle", 1500);


    private final String name;
    private final int price;

    //constructor
    Plan(String name, int price) {
        this.name = name;
        this.price = price;
    }


    //getters
    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }
}