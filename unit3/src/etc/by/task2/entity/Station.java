package etc.by.task2.entity;

public class Station {
    private Train[] trains;

    public Station(Train[] trains) {
        this.trains = trains;
    }

    public Train[] getTrains() {
        return trains;
    }

    public void setTrains(Train[] trains) {
        this.trains = trains;
    }
}
