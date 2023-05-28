package ArrayANDbasic;

import java.util.Scanner;

public class CalculatePower {
    int calculatePower(int base , int power){
        int result = 1;
    while (power != 0){
        result *=base;   // result = result * base
        --power;
    }
    return result;

    }

    public static void main(String[] args) {
        System.out.println("enter the base");
        Scanner input = new Scanner(System.in);
        int base = input.nextInt();

        System.out.println("Enter the power");
        int power = input.nextInt();

        CalculatePower obj = new CalculatePower();
       int FinalResult = obj.calculatePower(base, power);

        System.out.println("The answer is " + FinalResult);
    }
}
