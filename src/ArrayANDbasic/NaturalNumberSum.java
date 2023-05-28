package ArrayANDbasic;

import java.util.Scanner;
public class NaturalNumberSum {
    int sumOfNaturalNumbers(){
        System.out.println("Enter the number");
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();

        int result = 0;
        for (int i = 1; i<=num ; i++){
            result += i;
        }
        return result;

    }

    public static void main(String[] args) {
        NaturalNumberSum obj = new NaturalNumberSum ();
        int final_sum= obj.sumOfNaturalNumbers();
        System.out.println("The sum of natural numbers is " + final_sum);

    }
}
