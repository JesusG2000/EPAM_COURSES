package by.etc.task1.area.entity;

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
}
