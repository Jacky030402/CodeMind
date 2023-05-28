package ArrayANDbasic;

import java.util.Scanner;
public class sum_natural_num {
    public static void main(String[] args) {
        System.out.println("enter the number");

        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        int sum = 0;
        for(int i=1; i<= num ; i++){
            sum+=i;// sum = sum + i
        }
        System.out.println(sum);
    }
}
