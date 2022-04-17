package com.bytelegend;

public class Food {
    private final String name;
    private final boolean clean;

    public Food(String name, boolean clean) {
        this.name = name;
        this.clean = clean;
    }

    public String getName() {
        return name;
    }

    public boolean isClean() {
        return clean;
    }

    @Override
    public String toString() {
        return "Food{" + "name='" + name + '\'' + ", clean=" + clean + '}';
    }
}
