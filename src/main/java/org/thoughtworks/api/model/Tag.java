package org.thoughtworks.api.model;

public enum Tag {
    CXF("cxf");
    private String name;

    public String getName() {
        return name;
    }

    public static Tag fromString(String name) {
        for (Tag tag : values()) {
            if (tag.getName().equals(name)) {
                return tag;
            }
        }
        return null;
    }

    Tag(String name) {
        this.name = name;
    }
}
