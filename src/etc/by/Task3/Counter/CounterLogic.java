package etc.by.Task3.Counter;

public class CounterLogic {
   private Counter counter;

    public CounterLogic(Counter counter) {
        this.counter = counter;
    }
    public void increment() {
        if (counter.getValue() != counter.getEnd()) {
            int number=counter.getValue();
            number++;
            counter.setValue(number);
        }
    }
    public void decrement(){
        if(counter.getValue()!=counter.getBegin()) {
            int number=counter.getValue();
            number--;
            counter.setValue(number);
        }
    }
}
