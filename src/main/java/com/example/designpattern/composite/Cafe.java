package com.example.designpattern.composite;

import java.util.ArrayList;
import java.util.List;
public class Cafe implements CafeComponent{

    private List<Table> tables = new ArrayList<>();

    public void addTable(Table table) {
        tables.add(table);
    }

    @Override
    public double getPrice() {
        return tables.stream().mapToDouble(Table::getPrice).sum();
    }
}
