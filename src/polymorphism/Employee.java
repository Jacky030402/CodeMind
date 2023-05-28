package polymorphism;

public class Employee {
    int incrementSalary(int salary){
        System.out.println("Increment in salary is:");
        double newSalary =( salary )+ ( salary* 3/100);
        return (int) newSalary;
    }
}
