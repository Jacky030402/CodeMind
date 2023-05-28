package ArrayANDbasic;

import java.util.Scanner;
public class marks_grades {
    public static void main(String[] args){
        System.out.println("Enter the marks of student ");
        Scanner input = new Scanner(System.in);
        int marks = input.nextInt();

        if(marks>= 80){
            System.out.println(" Grade A");
        }
        else if (marks>=60){
            System.out.println("Grade B");
        }
        else if(marks>=50){
            System.out.println("Grade C");
        }
        else if (marks>=45){
            System.out.println(" Grade D");
        }
        else if( marks>=25){
            System.out.println("Grade E");
        }
        else {
            System.out.println("Grade F");
        }
    }
}
