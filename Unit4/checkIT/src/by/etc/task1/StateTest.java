package by.etc.task1;

import by.etc.task1.entity.Area;
import by.etc.task1.entity.City;
import by.etc.task1.entity.Region;
import by.etc.task1.entity.State;
import by.etc.task1.logic.StateLogic;

//Создать объект класса Государство, используя классы Область, Район, Город. Методы: вывести на консоль
//столицу, количество областей, площадь, областные центры.
public class StateTest {
    public static void main(String[] args) {
        Area[] areas;
        City[] cities;
        Region[] regions;
        State state;

        regions = new Region[5];

        for (int i = 0; i < regions.length; i++) {
            cities = new City[2];
            for (int y = 0; y < cities.length; y++) {
                areas = new Area[2];
                for (int z = 0; z < areas.length; z++) {
                    areas[z]=new Area("area "+(int)(Math.random()*100),(int)(Math.random()*100));
                }
                cities[y]=new City("city "+(int)(Math.random()*100)+y,areas);
            }
            regions[i]=new Region("region "+(int)(Math.random()*100),cities,i+"");
        }

        state=new State("some state",regions,"Minsk");
        StateLogic stateLogic=new StateLogic();

        int regionCount= stateLogic.regionCount(state);
        double stateSize= stateLogic.takeStateSize(state);
        String []regionCapitals=stateLogic.regionsCapital(state);

        for(String s : regionCapitals){
            System.out.println(s);
        }

        System.out.println(regionCount);
        System.out.println(stateSize);
        System.out.println(state.getCapital());
    }
}
