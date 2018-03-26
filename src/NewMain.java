import java.util.*;

public class NewMain {

    public static void main(String[] args){

        Gwiazda g1=new Gwiazda("Orion",15.5);
        Gwiazda g2=new Gwiazda("Alfa",5.5);
        Gwiazda g3=new Gwiazda("Centauri",20.5);
        Gwiazda g4=new Gwiazda("Nowa",20.5);

        Planeta p1=new Planeta("Ziemia",20.3,true);
        Planeta p2=new Planeta("Jowisz",50.4,false);
        Planeta p3=new Planeta("Saturn",23.0,false);
        Planeta p4=new Planeta("Astera",23.0,false);

        Map<Gwiazda,Planeta> mapa=new HashMap();

        mapa.put(g1,p1);
        mapa.put(g2,p2);
        mapa.put(g3,p3);
        mapa.put(g4,p4);

        PlanetComparator pc=new PlanetComparator();
        Set<Planeta> planetaSet=new TreeSet(pc);

        planetaSet.addAll(mapa.values());

        Planeta[] tabPlaneta= new Planeta[planetaSet.size()];

        planetaSet.toArray(tabPlaneta);

        Arrays.sort(tabPlaneta,pc);

        for(Planeta planeta:tabPlaneta){
            System.out.println(planeta);
        }
    }
}
