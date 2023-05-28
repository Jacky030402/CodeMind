package Inheritance;

public class VehicleTest {
    public static void main(String[] args) {
        System.out.println("ArrayANDbasic.Test for Motorcycle ");
        MotorCycle m1 = new MotorCycle();
        m1.setCompany("HONDA");
        m1.setModel("SHINE");
        m1.setSpeed(90);
        m1.setCost(90000);

        System.out.println(m1.getCompany());
        System.out.println(m1.getModel());
        System.out.println(m1.getSpeed());
        System.out.println(m1.getCost());

        System.out.println("ArrayANDbasic.Test for Car");
        Car c1 = new Car();
        c1.setCompany("TATA");
        c1.setModel("SAFARI");
        c1.setSpeed(1200);
        c1.setCost(1500000);

        System.out.println(c1.getCompany());
        System.out.println(c1.getModel());
        System.out.println(c1.getSpeed());
        System.out.println(c1.getCost());

    }
}
