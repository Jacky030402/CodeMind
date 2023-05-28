package ArrayANDbasic;

import java.util.Scanner;
public class positive_negative_num {
    public static void main(String[] args) {
        System.out.println(" Enter the number ");
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();

        if (num> 0){
            System.out.println("Entered number if positive");
        }
        else if (num < 0){
            System.out.println(" entered number is negative");
        }
        else{
            System.out.println(" entered number is 0 (zero)");
        }
    }
}
