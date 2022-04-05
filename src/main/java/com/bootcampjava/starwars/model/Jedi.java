package com.bootcampjava.starwars.model;

public class Jedi {

    private int id;
    private String name;
    private int strenght;
    private int version;

    public Jedi() {
    }

    public Jedi(int id, String name, int strength, int version) {
        this.id = id;
        this.name = name;
        this.strenght = strength;
        this.version = version;
    }

    public Jedi(String name, int strength) {
        this.name = name;
        this.strenght = strength;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getStrenght() {
        return strenght;
    }

    public void setStrenght(int strenght) {
        this.strenght = strenght;
    }

    public int getVersion() {
        return version;
    }

    public void setVersion(int version) {
        this.version = version;
    }
}
