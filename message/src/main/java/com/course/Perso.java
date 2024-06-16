package com.course;

public class Perso {

    private String name;
    private Houses houses;

    public Perso(String name, Houses houses) {
        this.name = name;
        this.houses = houses != null ? houses : Houses.Unknown;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Houses getHouses() {
        return houses;
    }

    public void setHouse(Houses houses) {
        this.houses = houses;
    }
}