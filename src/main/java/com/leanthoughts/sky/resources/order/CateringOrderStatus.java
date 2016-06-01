package com.leanthoughts.sky.resources.order;

public class CateringOrderStatus {

    private String name;
    private String abbrieviation;

    public CateringOrderStatus() {}

    public CateringOrderStatus(String name, String abbrieviation) {
        this.name = name;
        this.abbrieviation = abbrieviation;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAbbrieviation() {
        return abbrieviation;
    }

    public void setAbbrieviation(String abbrieviation) {
        this.abbrieviation = abbrieviation;
    }
}