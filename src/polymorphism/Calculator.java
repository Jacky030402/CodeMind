package polymorphism;
//over loading
public class Calculator {
    void add(int a , int b){
        int c = a+b;
        System.out.println("the sum is:" + c);
    }
    void add(int a , int b, int c){
        int d = a+b+c;
        System.out.println("the sum is " + d);
    }

}
