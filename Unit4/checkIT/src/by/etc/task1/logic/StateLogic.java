package by.etc.task1.logic;

import by.etc.task1.entity.State;
import by.etc.task1.entity.Region;
import by.etc.task1.logic.RegionLogic;

public class StateLogic {
    public  double takeStateSize(State state){
        double size=0;
        RegionLogic regionLogic =new RegionLogic();
        Region[]regions= state.getRegions();
        for(Region r:regions){
            size+= regionLogic.takeRegionSize(r);
        }
        return size;
    }
    public  int regionCount(State state){
        return state.getRegions().length;
    }

    public  String[] regionsCapital(State state){
        String[] capitals=new String[state.getRegions().length];
        Region[] regions=state.getRegions();
        for(int i =0 ; i < regions.length ;i++){
            capitals[i]=regions[i].getCenter();
        }
        return capitals;
    }
}
