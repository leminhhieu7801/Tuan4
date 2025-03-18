package com.example.designpattern.composite;

public class CafeRevenueCalculator {

    public static void main(String[] args) {
        Product coffee = new Product("Coffee", 50);
        Product water = new Product("Water", 20);
        Product milkTea = new Product("Milk Tea", 65);

        Table table1 = new Table(1);
        table1.addItem(coffee);
        table1.addItem(water);

        Table table2 = new Table(2);
        table2.addItem(milkTea);
        table2.addItem(coffee);

        Cafe cafe = new Cafe();
        cafe.addTable(table1);
        cafe.addTable(table2);

        System.out.println("Total Revenue: " + cafe.getPrice());
    }
}
