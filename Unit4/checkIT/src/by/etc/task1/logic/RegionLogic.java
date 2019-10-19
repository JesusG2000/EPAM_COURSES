package by.etc.task1.logic;

import by.etc.task1.entity.City;
import by.etc.task1.entity.Region;

public class RegionLogic {
    public  double takeRegionSize(Region r){
        double size=0;
        CityLogic logic=new CityLogic();

        City []cities=r.getCities();
        for(City c : cities){
            size+= logic.takeCitySize(c);
        }
        return size;
    }
}
