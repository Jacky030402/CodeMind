package JavaCollection;

import java.util.HashMap;
import java.util.*;

public class Hashmap {
    public static void main(String[] args) {
        HashMap<Integer , Employee> hm = new HashMap<>();

        Employee emp = new Employee();
        emp.setEmpId(10);
        emp.setName("jacky");
        emp.setMoNo(860535);

        Employee emp2 = new Employee();
        emp2.setEmpId(20);
        emp2.setName("jagannath");
        emp2.setMoNo(12345);

        hm.put(10, emp);
        hm.put(20, emp2);

        Set<Integer> KeySet = hm.keySet();

for(Integer key : KeySet){

}

    }
}
