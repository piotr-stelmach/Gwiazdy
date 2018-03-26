import java.util.Comparator;

public class PlanetComparator implements Comparator<Planeta>{


    @Override
    public int compare(Planeta o1, Planeta o2) {
        if(o1.getDiameter()<o2.getDiameter()) return 1;

        if(o1.getDiameter()>o2.getDiameter()) return -1;

        if(o1.getDiameter()==o2.getDiameter()){
            if(o1.equals(o2.getName())==true) {
                return 1;
            }else return -1;
        }
        return 0;
    }
}
