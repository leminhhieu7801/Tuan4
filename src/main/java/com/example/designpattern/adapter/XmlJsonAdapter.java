package com.example.designpattern.adapter;
import org.json.JSONObject;
import org.json.XML;
public class XmlJsonAdapter implements DataAdapter{

    @Override
    public String convertToJson(String xmlData) {
        JSONObject json = XML.toJSONObject(xmlData);
        return json.toString(4); // Pretty Print JSON
    }

    @Override
    public String convertToXml(String jsonData) {
        JSONObject json = new JSONObject(jsonData);
        return XML.toString(json);
    }
}
