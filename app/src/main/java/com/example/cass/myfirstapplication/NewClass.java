package com.example.cass.myfirstapplication;

/**
 * Created by Cass on 2016/7/20.
 */
public class NewClass {
    private String name;
    private String id;

    public NewClass(String name, String id) {
        this.name = name;
        this.id = id;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public NewClass(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }
}
