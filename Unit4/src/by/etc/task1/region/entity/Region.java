package by.etc.task1.region.entity;

import by.etc.task1.city.entity.City;

import java.util.Arrays;

public class Region {
    private String name;
    private City[]cities;
    private String center;

    public Region(String name, City[] cities, String center) {
        this.name = name;
        this.cities = cities;
        this.center = center;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public City[] getCities() {
        return cities;
    }

    public void setCities(City[] cities) {
        this.cities = cities;
    }

    public String getCenter() {
        return center;
    }

    public void setCenter(String center) {
        this.center = center;
    }

    @Override
    public String toString() {
        return "Region{" +
                "name='" + name + '\'' +
                ", cities=" + Arrays.toString(cities) +
                ", center='" + center + '\'' +
                '}';
    }
}
