package Inheritance;

public class Test {
    public static void main(String[] args) {
        System.out.println("test for SwDeveloper class");
        SoftWareDeveloper sObj = new SoftWareDeveloper();
        sObj.setId(1);
        sObj.setName("jagannath");
        sObj.setMoNo(860536610);
        sObj.setSalary(50000);
        sObj.setCarAllowance(5000);

        System.out.println(sObj.getId());
        System.out.println(sObj.getName());
        System.out.println(sObj.getSwDeveloperSalary());

        System.out.println("test for tester class");
        Tester sObj2 = new Tester();
        sObj2.setShiftAllowance(3300);
        sObj2.setId(2);
        sObj2.setName("jacky");
        sObj2.setMoNo(860536610);
        sObj2.setSalary(50000);

        System.out.println(sObj2.getId());
        System.out.println(sObj2.getName());
        System.out.println(sObj2.getTesterSalary());



    }
}
