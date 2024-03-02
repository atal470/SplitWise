package org.example.dto;

import java.util.Map;

public class User {
    String name;

    public Map<String, Expense> getLendToMap() {
        return lendToMap;
    }
    public void setLendToMap(Map<String, Expense> lendToMap) {
        this.lendToMap = lendToMap;
    }
    Map<String,Expense> lendToMap;

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public User(String name,Map<String,Expense> lendToMap){
        this.name=name;
        this.lendToMap=lendToMap;
    }

}
