package com.cs09;

public class Car {
    private int wheels;
    private String model;
    private String engine;

    public void setModel(String newModel) {
        String validateModel = newModel.toLowerCase();
        if (validateModel.equals("carrera")) {
            this.model = newModel;
        }
        else {
            this.model = "Unknown";
        }
    }

    public String getModel() {
        return this.model;
    }
}
