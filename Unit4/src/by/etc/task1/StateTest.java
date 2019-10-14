package by.etc.task1;

import by.etc.task1.area.entity.Area;
import by.etc.task1.city.entity.City;
import by.etc.task1.region.entity.Region;
import by.etc.task1.state.entity.State;
import by.etc.task1.state.logic.StateLogic;
import org.w3c.dom.ls.LSOutput;

//Создать объект класса Государство, используя классы Область, Район, Город. Методы: вывести на консоль
//столицу, количество областей, площадь, областные центры.
public class StateTest {
    public static void main(String[] args) {
        Area[] areas;
        City[] cities;
        Region[] regions = new Region[5];
        State state;

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
        int regionCount= StateLogic.regionCount(state);
        double stateSize= StateLogic.takeStateSize(state);
        String []regionCapitals=StateLogic.regionsCapital(state);
        for(String s : regionCapitals){
            System.out.println(s);
        }
        System.out.println(regionCount);
        System.out.println(stateSize);
        System.out.println(state.getCapital());
    }
}
