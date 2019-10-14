package by.etc.task1.state.logic;

import by.etc.task1.state.entity.State;
import by.etc.task1.region.entity.Region;
import by.etc.task1.region.logic.RegionLogic;

public class StateLogic {
    public static double takeStateSize(State state){
        double size=0;
        Region[]regions= state.getRegions();
        for(Region r:regions){
            size+= RegionLogic.takeRegionSize(r);
        }
        return size;
    }
    public static int regionCount(State state){
        return state.getRegions().length;
    }

    public static String[] regionsCapital(State state){
        String[] capitals=new String[state.getRegions().length];
        Region[] regions=state.getRegions();
        for(int i =0 ; i < regions.length ;i++){
            capitals[i]=regions[i].getCenter();
        }
        return capitals;
    }
}
