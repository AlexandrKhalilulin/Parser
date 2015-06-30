package com.epam.ak.model;

public class Leaf extends Component {
    private char value;

    public Leaf() {
    }

    public Leaf(String type) {
        super(type);
    }

    @Override
    public String stringify() {
        return String.valueOf(value);
    }

    public char getValue() {
        return value;
    }

    public void setValue(char value) {
        this.value = value;
    }
}
