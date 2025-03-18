package com.example.designpattern.observer;

public class ObserverPatternExample {

    public static void main(String[] args) {
        // Stock example
        Stock appleStock = new Stock("Apple", 150);
        Investor investor1 = new Investor("Alice");
        Investor investor2 = new Investor("Bob");

        appleStock.addObserver(investor1);
        appleStock.addObserver(investor2);

        appleStock.setPrice(155);
        appleStock.setPrice(160);

        // Task example
        Task task = new Task("Develop Login Feature");
        TeamMember member1 = new TeamMember("Charlie");
        TeamMember member2 = new TeamMember("David");

        task.addObserver(member1);
        task.addObserver(member2);

        task.setStatus("In Progress");
        task.setStatus("Completed");
    }
}
