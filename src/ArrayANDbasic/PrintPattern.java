package ArrayANDbasic;

import java.util.Scanner;

public class PrintPattern {
    public static void main(String[] args) {
        System.out.println("Enter the number of rows");
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();

        for (int i = 1; i<=num; i++){
            for(int j = 1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
