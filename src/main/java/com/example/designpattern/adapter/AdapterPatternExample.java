package com.example.designpattern.adapter;

public class AdapterPatternExample {
    public static void main(String[] args) {
        DataAdapter adapter = new XmlJsonAdapter();

        String xmlData = "<user><name>John</name><age>30</age></user>";
        String jsonData = adapter.convertToJson(xmlData);
        System.out.println("Converted to JSON:\n" + jsonData);

        String backToXml = adapter.convertToXml(jsonData);
        System.out.println("Converted back to XML:\n" + backToXml);
    }
}
