package ArrayANDbasic;

import java.util.Scanner;

public class even_odd {
    public static void main(String[] args) {
        System.out.println("find even or odd number");
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();

        if(num % 2==0){
            System.out.println("given number is even number");
        }
        else{
            System.out.println("given number is odd number");
        }
    }
}
