package Inheritance;

public class Test3 {
    public static void main(String[] args) {
        System.out.println("test for Grand child");
        GrandChild c1 = new GrandChild();
        c1.setName("Ajit");
        c1.setHeight(120);
        c1.setWeight(40);
        c1.setBloodGroup("O+");

        System.out.println(" name      "+ c1.getName());
        System.out.println("height     "+ c1.getHeight());
        System.out.println("weight     "+ c1.getWeight());
        System.out.println("Blood group"+ c1.getBloodGroup());

        System.out.println("ArrayANDbasic.Test for child");
        Child c2 = new Child();
        c2.setName("Parshuram");
        c2.setHeight(140);
        c2.setWeight(60);
        c2.setBloodGroup("A+");

        System.out.println("name       "+ c2.getName());
        System.out.println("weight     "+ c2.getWeight());
        System.out.println("height     "+ c2.getHeight());
        System.out.println("blood group" + c2.getBloodGroup());

        System.out.println("ArrayANDbasic.Test for parant");
        Parant p1 = new Parant();
        p1.setName("Luxman");
        p1.setHeight(160);
        p1.setWeight(80);
        p1.setBloodGroup("B+");

        System.out.println("name       "+ p1.getName());
        System.out.println("height     "+ p1.getHeight());
        System.out.println("weight     "+ p1.getWeight());
        System.out.println("blood group"+ p1.getBloodGroup());
    }
}
