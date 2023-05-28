package Encapusulation;

public class CarTest {
//    String model;
//    String Companay;
//    int speed;

    public static void main(String[] args) {
        Car c1 = new Car();
        c1.setCompany("tata");
        c1.setSpeed(50);
        c1.setModel("safari");

        System.out.println(c1.getSpeed());
        System.out.println(c1.getCompany());
        System.out.println(c1.getModel());
    }


}
