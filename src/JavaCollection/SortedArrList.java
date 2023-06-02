package JavaCollection;

import java.util.ArrayList;
import java.util.Collections;

public class SortedArrList {
    public static void main(String[] args) {
        ArrayList<Integer> al = new ArrayList<>();
        al.add(4);
        al.add(5);
        al.add(1);
        al.add(2);
        al.add(9);
        al.add(0);

        for(int i= 0; i<al.size(); i++){
            System.out.print(al.get(i));
            System.out.print(",");

        }
        System.out.println(" ");
        Collections.sort(al);
        System.out.println("sorted arraylist is :"+ al);



    }
}
