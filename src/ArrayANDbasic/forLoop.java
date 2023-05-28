package ArrayANDbasic;

import java.util.Scanner;
public class forLoop {
    public static void main(String[] args) {
        System.out.println("Enter the number to print  the table");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int i;

        for(i=1;i<=10;i++ ){
            System.out.println(num*i);
        }
    }
}
