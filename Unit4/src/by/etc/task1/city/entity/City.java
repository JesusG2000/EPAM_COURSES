package by.etc.task1.city.entity;

import by.etc.task1.area.entity.Area;

import java.util.Arrays;

public class City {
    private String name;
    private Area[] areas;

    public City(String name, Area[] areas) {
        this.name = name;
        this.areas = areas;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Area[] getAreas() {
        return areas;
    }

    public void setAreas(Area[] areas) {
        this.areas = areas;
    }

    @Override
    public String toString() {
        return "City{" +
                "name='" + name + '\'' +
                ", areas=" + Arrays.toString(areas) +
                '}';
    }
}
