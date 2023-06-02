package JavaCollection;

import java.util.ArrayList;
import java.util.HashSet;

public class ArrBasic {
    public static void main(String[] args) {
        int arr []= new int[5];
        arr[0]=10;
        arr[1]=20;
        System.out.println("Array value-"+arr[0]);
        System.out.println("Array value-"+arr[1]);

        ArrayList<Integer> al = new ArrayList<>();
        al.add(11);
        al.add(11);
        al.add(22);
        al.add(22);

//        System.out.println("array list value_"+al.get(0));
//        System.out.println("array list value_"+al.get(1));
        for(int i= 0;i<al.size();i++){
        System.out.println("arraylist "+al.get(i));
}

        ArrayList al2 = new ArrayList();
        al2.add(45);
        al2.add("jacky");
//        System.out.println(al2.get(0));
//        System.out.println(al2.get(1));

        HashSet<Integer> hs = new HashSet<>();
        hs.add(555);
        hs.add(44);
        hs.add(44);
        hs.add(555);
        for(int values : hs){
            System.out.println("Hashlist "+values);
        }

    }
}
