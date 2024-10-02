/**
 * foreachBeispiel
 */
package b1_listen;

public class foreachBeispiel {

    public static void main(String[] args) {
       String[] names = new String [3];

       names[0]="Max";
       names[1]="Michael";
       names[0]="Niko";

       for (String name : names) {
System.out.println(name);
       }
    }

}