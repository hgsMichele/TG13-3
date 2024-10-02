package b1_listen;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class arraylistNamen {

    public static void main(String[] args) {
        ArrayList<String> namen = new ArrayList<>();

        namen.add("Miggi");
        namen.add("Dirk");
        namen.add("John");
        namen.add("Hans");

        System.out.println(namen);

        for (String names : namen) {
            System.out.println("Namen: "+names);
        }
namen.remove(String.valueOf("Miggi"));
System.out.println(namen);

String i1 = namen.get(0);
        System.out.println(i1);

if (namen.contains("Dirk")) {
    System.out.println("Dirk ist Teil der Liste");
}
Collections.sort(namen);
    }
    
}
