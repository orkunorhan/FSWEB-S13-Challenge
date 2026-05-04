package org.example.enums;

public enum Plan {
    BASIC("Basic", 0),
    PRO("Pro", 99),
    PREMIUM("Premium", 199);

    private final String name;
    private final int price;

    Plan(String name, int price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }
}
