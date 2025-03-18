package com.example.designpattern.adapter;

public interface DataAdapter {
    String convertToJson(String xmlData);
    String convertToXml(String jsonData);
}
