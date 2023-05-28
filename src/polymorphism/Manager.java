package polymorphism;

public class Manager {
    double incrementSalary(double salary){
        System.out.println("Increment in salary is:");
        double newSalary =( salary )+ ( salary* 8/100);
        return newSalary;
    }
}
