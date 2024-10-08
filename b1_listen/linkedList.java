package b1_listen;

import java.util.LinkedList;

public class linkedList {
    
    public static void main(String[] args) {
        LinkedList<String> programmiersprachen = new LinkedList<>();

        programmiersprachen.add("Java");  
        programmiersprachen.add("C++");
        programmiersprachen.add("C#");

        System.out.println(programmiersprachen);

        for (String Str : programmiersprachen) {
            System.out.println("Programmiersprachen:"+Str);
        }
programmiersprachen.remove(String.valueOf("C#"));


    }
}
