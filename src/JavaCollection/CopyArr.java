package JavaCollection;

import java.util.ArrayList;

public class CopyArr {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("jagannath");
        list.add("parshuram");
        list.add("autade");

        ArrayList<String> list2 = new ArrayList<>();

        for(String elements : list){
            list2.add(elements);
            //System.out.println(elements);
        }
        System.out.println("copied arraylist is:" + list2);
    }
}
