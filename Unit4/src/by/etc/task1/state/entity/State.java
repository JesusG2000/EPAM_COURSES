package by.etc.task1.state.entity;

import by.etc.task1.region.entity.Region;

import java.util.Arrays;

public class State {
    private String name;
    private Region[]regions;
    private String capital;

    public State(String name, Region[] regions, String capital) {
        this.name = name;
        this.regions = regions;
        this.capital = capital;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Region[] getRegions() {
        return regions;
    }

    public void setRegions(Region[] regions) {
        this.regions = regions;
    }

    public String getCapital() {
        return capital;
    }

    public void setCapital(String capital) {
        this.capital = capital;
    }

    @Override
    public String toString() {
        return "State{" +
                "name='" + name + '\'' +
                ", regions=" + Arrays.toString(regions) +
                ", capital='" + capital + '\'' +
                '}';
    }
}
