package JavaCollection;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrListMethods {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(7);
        list.add(5);
        list.add(9);
        list.add(3);
        list.add(1);

       boolean value =  list.contains(11);
        System.out.println("given value is present: " + value);


        }
    }

