package ArrayANDbasic;

import java.util.Scanner;

public class ArrayInput {
    public static void main(String[] args) {
        System.out.println("taking input as size of array");
        Scanner input = new Scanner(System.in);
        int size = input.nextInt();
        int roll_num [] = new int [size];

        System.out.println("taking input as array values ");
        for(int i=0; i<size; i++){
             roll_num[i] = input.nextInt();
        }
        System.out.println("printing the values stored in the array");
        for(int i=0; i<size; i++){
            System.out.println(roll_num[i]);
        }



    }
}
