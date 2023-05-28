package polymorphism;

public class Developer extends Employee{

    int incrementSalary(int salary){
        System.out.println("Increment in salary is:");
        double newSalary = salary + ( salary* 5/100);
        return (int) newSalary;
    }
}
