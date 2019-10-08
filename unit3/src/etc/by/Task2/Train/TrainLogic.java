package etc.by.Task2.Train;

public class TrainLogic {
   private Train []train;

    public TrainLogic(Train[] train) {
        this.train = train;
    }

    public Train[] sortByTrainNumber(){
        for(int i = 0 ; i < train.length ; i++){
            for(int y = 0 ; y < train.length ; y++){
                if(train[i].getTrainNumber()<train[y].getTrainNumber()){
                    Train replace=train[i];
                    train[i]=train[y];
                    train[y]=replace;
                }
            }
        }
        return train;
    }



   public void getInfo(int number){
        System.out.println("Place: "+train[number].getPlace()+" "+
                "train number: "+train[number].getTrainNumber()+" "+
                "time: "+train[number].getHour()+"."+train[number].getMin());

    }
    public  Train[] sortByPlace() {
        for (int i = 0; i < train.length; i++) {
            for (int y = 0; y < train.length; y++) {
                if (train[i].getPlace().toLowerCase().charAt(0) <= train[y].getPlace().toLowerCase().charAt(0)) {
                    Train replace = train[i];
                    train[i] = train[y];
                    train[y] = replace;
                }
            }
        }
        for(int i = 0 ; i < train.length ; i++){
            for(int y = 0 ; y < train.length;y++){
                if (train[i].getPlace().equals(train[y].getPlace())) {
                    int timeFirst = train[i].getHour() * 60 + train[i].getMin();
                    int timeSecond = train[y].getHour() * 60 + train[y].getMin();
                    if (timeFirst < timeSecond) {
                        Train replace = train[i];
                        train[i] = train[y];
                        train[y] = replace;
                    }
                }
            }
        }
        return train;
    }
}
