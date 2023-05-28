package polymorphism;

import org.w3c.dom.ls.LSOutput;

//over riding
public class SBIbank extends Bank{
    double calInterest(double amount, float duration){
     return amount * duration *8/100;
    }

    public static void main(String[] args) {
        System.out.println("for genrel bank class main parant class");
        Bank obj = new Bank();
      double interest =   obj.calInterest(100,5);
        System.out.println(interest);
        obj.saveUserDetails();
        obj.withDrawAmount();

        System.out.println("for SBI bank when interest rate is diff");
        Bank obj2 = new SBIbank();
       double interestSBI= obj2.calInterest(100,5);
        System.out.println(interestSBI);

    }
}
