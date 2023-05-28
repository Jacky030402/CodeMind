package polymorphism;

public class Bank {
    double calInterest(double amount, float duration){
        System.out.println("inside the parant class of bank");
        return amount * duration * 6/100;
    }
    void saveUserDetails(){
        System.out.println("inside save user method");
    }
    void withDrawAmount(){
        System.out.println("inside the withDraw method");
    }
}
