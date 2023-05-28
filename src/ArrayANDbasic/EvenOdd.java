package ArrayANDbasic;

import java.util.Scanner;

public class EvenOdd {
    void checkEvenOrOdd(){
        System.out.println("Enter any number ");
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();

        if(num % 2 == 0){
            System.out.println("Even number");
        }
        else{
            System.out.println("Odd number");
        }

    }

    public static void main(String[] args) {
        EvenOdd  obj = new EvenOdd ();
        obj.checkEvenOrOdd();

    }
}
