package by.etc.task4.entity;

public enum Trip {
   REST("car","nothing",1),
   EXCURSION("train","nothing",2),
   TREATMENT("plane","nothing",7),
   SHOPPING("bike","nothing",4),
   CRUISE("walk","nothing",5);

   private String transport;
   private String food;
   private int days;

   Trip(String transport, String food, int days) {
      this.transport = transport;
      this.food = food;
      this.days = days;
   }

   public String getTransport() {
      return transport;
   }

   public void setTransport(String transport) {
      this.transport = transport;
   }

   public String getFood() {
      return food;
   }

   public void setFood(String food) {
      this.food = food;
   }

   public int getDays() {
      return days;
   }

   public void setDays(int days) {
      this.days = days;
   }

   @Override
   public String toString() {
      return "Trip{" +
              "transport='" + transport + '\'' +
              ", food='" + food + '\'' +
              ", days=" + days +
              '}';
   }
}
