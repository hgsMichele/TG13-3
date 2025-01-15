import java.util.ArrayList;
import java.util.List;
import java.util.TreeMap;

public class KNN {

    public static void main(String[] args) {
        System.out.println("test");
        List<Dataobj> testdaten = initTestDaten();
        System.out.println(testdaten);

        int k = 5;

        Dataobj neu = new Dataobj(5, 2);

        int klasseNeu = kNN(neu, testdaten, k);

        System.out.println(klasseNeu);
        
       }

    private static int kNN(Dataobj neu, List<Dataobj> testdaten, int k) {
        Map<double, Dataobjekt> abstaende = new TreeMap<>();
        return 0;
    }

    private static List<Dataobj> initTestDaten() {

        List<Dataobj> liste = new ArrayList<>();
        liste.add(new Dataobj(2, 9, 0));
        liste.add(new Dataobj(1, 7, 0));
        liste.add(new Dataobj(3, 8, 0));
        liste.add(new Dataobj(2, 7, 0));
        liste.add(new Dataobj(8, 2, 1));
        liste.add(new Dataobj(7, 4, 1));
        liste.add(new Dataobj(9, 1, 1));
        liste.add(new Dataobj(6, 3, 1));
        liste.add(new Dataobj(8, 3, 1));

        return liste;

    }

}