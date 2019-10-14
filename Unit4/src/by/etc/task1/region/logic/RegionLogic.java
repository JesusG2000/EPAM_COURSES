package by.etc.task1.region.logic;

import by.etc.task1.city.entity.City;
import by.etc.task1.city.logic.CityLogic;
import by.etc.task1.region.entity.Region;

public class RegionLogic {
    public static double takeRegionSize(Region r){
        double size=0;
        City []cities=r.getCities();
        for(City c : cities){
            size+= CityLogic.takeCitySize(c);
        }
        return size;
    }
}
