package com.epam.ak.model;

public abstract class Component {
    private String type;

    public Component() {
    }

    public Component(String type) {
        this.type = type;
    }

    public abstract String stringify();

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
