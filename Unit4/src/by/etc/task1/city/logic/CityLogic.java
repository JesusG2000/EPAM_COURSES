package by.etc.task1.city.logic;

import by.etc.task1.area.entity.Area;
import by.etc.task1.city.entity.City;

public class CityLogic {
   public static double takeCitySize(City c){
       double size=0;
       Area[] area=c.getAreas();
       for (Area value : area) {
           size += value.getSquare();
       }
       return size;
   }

}
