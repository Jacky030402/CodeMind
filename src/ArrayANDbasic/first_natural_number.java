package ArrayANDbasic;

import java.util.Scanner;
public class first_natural_number {
    public static void main(String[] args) {
        System.out.println("enter the number");

        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        int i=1 ;
        while(i<= num){
            System.out.println(i) ;
            i++;
        }
    }
}
