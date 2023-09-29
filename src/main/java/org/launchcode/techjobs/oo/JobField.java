package org.launchcode.techjobs.oo;

import java.util.Objects;

public abstract class JobField {

    // Declare fields with protected access
    int id;
    static int nextId = 1;
    String value;

    // Create constructors
    public JobField() {
        id = nextId;
        nextId++;
    }

    public JobField(String value) {
        this();
        this.value = value;
    }

    // Create custom methods; equals must be abstract to force child class implementation
    @Override
    public String toString(){
        return value;
    }

    @Override
    public abstract boolean equals(Object o);

    @Override
    public int hashCode(){
        return Objects.hash(getId());
    };


    // Generate getters and setters
    public int getId() {
        return id;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}
