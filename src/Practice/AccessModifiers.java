package Practice;

import library.Student;

public class AccessModifiers /*extends ArrayANDbasic.Student*/ {
    public static void main(String[] args) {
        Student jacky = new Student();
        jacky.getstudent();
        System.out.println(jacky.rno);
        System.out.println(jacky.name);
       // System.out.println(jacky.moNo); ...privet


        // protected modifier
        // AccessModifiers obj = new AccessModifiers();

       // System.out.println(obj.adress);
    }

}
// Protected -- make child class and inheritance
// extends (class)
// and make object of child class and access through child class object