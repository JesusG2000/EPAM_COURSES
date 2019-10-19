package by.etc.task1.logic;

import by.etc.task1.entity.Area;
import by.etc.task1.entity.City;

public class CityLogic {
   public  double takeCitySize(City c){
       double size=0;
       Area[] area=c.getAreas();
       for (Area value : area) {
           size += value.getSquare();
       }
       return size;
   }

}
