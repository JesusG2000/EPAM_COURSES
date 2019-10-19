package by.etc.task1.entity;

import by.etc.task1.entity.Area;

import java.util.Arrays;
import java.util.Objects;

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

    public Area getArea(int index){
        return areas[index];
    }

    public void setAreas(Area[] areas) {
        this.areas = areas;
    }

    public void setArea(Area area , int index) {
        areas[index]=area;
    }

    @Override
    public String toString() {
        return "City{" +
                "name='" + name + '\'' +
                ", areas=" + Arrays.toString(areas) +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        City city = (City) o;
        return Objects.equals(name, city.name) &&
                Arrays.equals(areas, city.areas);
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(name);
        result = 31 * result + Arrays.hashCode(areas);
        return result;
    }
}
