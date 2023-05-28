package Encapusulation;

import library.Student;

public class TestInPkg extends Student {
    public static void main(String[] args) {
        Student jagannath = new Student();
        jagannath.getstudent();
        System.out.println(jagannath.name);


        System.out.println(jagannath.getMoNo());
        //System.out.println(jagannath.getadress);

    }
}
