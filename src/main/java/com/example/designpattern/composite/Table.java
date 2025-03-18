package com.example.designpattern.composite;

import java.util.ArrayList;
import java.util.List;

public class Table implements CafeComponent{
    private int tableNumber;
    private List<CafeComponent> items = new ArrayList<>();

    public Table(int tableNumber) {
        this.tableNumber = tableNumber;
    }

    public void addItem(CafeComponent item) {
        items.add(item);
    }

    @Override
    public double getPrice() {
        return items.stream().mapToDouble(CafeComponent::getPrice).sum();
    }
}
