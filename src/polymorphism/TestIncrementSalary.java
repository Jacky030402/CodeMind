package polymorphism;

public class TestIncrementSalary {
    public static void main(String[] args) {
        Employee obj = new Developer();
       int newSalary= obj.incrementSalary(40000);
        System.out.println(newSalary);
    }
}
