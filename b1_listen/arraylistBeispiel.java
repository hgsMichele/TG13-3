package b1_listen;

import java.util.ArrayList;

public class arraylistBeispiel {
    public static void main(String[] args) {
        
        //Arraylist erstellen
        ArrayList<Integer> messwerte = new ArrayList<>();

        messwerte.add(3);
        messwerte.add(7);
        messwerte.add(-1);

        //Ausgabe
        System.out.println(messwerte);

        for (Integer mw : messwerte) {
            System.out.println("Messwert: "+mw);
            
        }
        Integer i1 = messwerte.get(0);
        System.out.println(i1);

        messwerte.remove(Integer.valueOf(-1));

        System.out.println(messwerte);

        if (messwerte.contains(7)) {
            System.out.println("7 ist in der Liste");
        }
    }
  
}
