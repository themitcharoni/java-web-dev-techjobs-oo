package org.launchcode.techjobs_oo;

import java.util.Objects;

public class Location extends JobField {
//    private int id;
//    private static int nextId = 1;
    private String value;

    public Location(String value) {
        super(value);
    }
//    @Override
//    public String toString() {
//        return value;
//    }
//
//    @Override
//    public int getId() {
//        return id;
//    }

    @Override
    public String getValue() {
        return value;
    }

    @Override
    public void setValue(String value) {
        this.value = value;
    }
}
