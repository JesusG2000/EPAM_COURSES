package by.etc.task1.entity;

import java.util.Objects;

public class Area {
    private String name;
    private double square;

    public Area(String name, double square) {
        this.name = name;
        this.square = square;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSquare() {
        return square;
    }

    public void setSquare(double square) {
        this.square = square;
    }

    @Override
    public String toString() {
        return "Area{" +
                "name='" + name + '\'' +
                ", square=" + square +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Area area = (Area) o;
        return Double.compare(area.square, square) == 0 &&
                Objects.equals(name, area.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, square);
    }
}
