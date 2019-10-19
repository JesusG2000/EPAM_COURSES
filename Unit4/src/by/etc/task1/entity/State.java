package by.etc.task1.entity;

import by.etc.task1.entity.Region;

import java.util.Arrays;
import java.util.Objects;

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

    public Region getRegion(int index){return regions[index];}

    public void setRegion(Region region ,int index){regions[index]=region;}

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        State state = (State) o;
        return Objects.equals(name, state.name) &&
                Arrays.equals(regions, state.regions) &&
                Objects.equals(capital, state.capital);
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(name, capital);
        result = 31 * result + Arrays.hashCode(regions);
        return result;
    }
}
