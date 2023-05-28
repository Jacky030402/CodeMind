package ArrayANDbasic;

import java.util.Scanner;
public class upper_lowercase {
    public static void main(String[] args) {
        System.out.println("Enter the character");
        Scanner input = new Scanner(System.in);
        char ch = input.next().charAt(0);

        if (ch >= 'A'&& ch <= 'Z'){
            System.out.println(ch + " : given alphabet is uppercase");
        }
        else if (ch >= 'a' && ch <= 'z'){
            System.out.println(ch + " : given alphabet is lowercase");
        }
        else {
            System.out.println( ch +": entered character is not alphabet");
        }

    }
}
