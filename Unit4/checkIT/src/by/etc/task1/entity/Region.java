package by.etc.task1.entity;

import java.util.Arrays;
import java.util.Objects;

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

    public City getCity(int index){
        return cities[index];
    }

    public void setCity(City city , int index){
        cities[index]=city;
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Region region = (Region) o;
        return Objects.equals(name, region.name) &&
                Arrays.equals(cities, region.cities) &&
                Objects.equals(center, region.center);
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(name, center);
        result = 31 * result + Arrays.hashCode(cities);
        return result;
    }
}
