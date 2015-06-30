package com.epam.ak.model;

import java.util.List;

public class Composite extends Component {
    private List<Component> components;

    public Composite() {
    }

    public Composite(String type) {
        super(type);
    }

    @Override
    public String stringify() {
        StringBuilder builder = new StringBuilder();
        components.forEach(c -> builder.append(c.stringify()));
        return String.valueOf(builder);
    }

    public List<Component> getComponents() {
        return components;
    }

    public void setComponents(List<Component> components) {
        this.components = components;
    }
}
