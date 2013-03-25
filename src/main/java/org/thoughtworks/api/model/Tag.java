package org.thoughtworks.api.model;

public enum Tag {
    CXF("cxf");
    private String name;

    public String getName() {
        return name;
    }

    Tag(String name) {
        this.name = name;
    }
}
