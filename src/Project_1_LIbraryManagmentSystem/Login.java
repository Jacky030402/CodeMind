package Project_1_LIbraryManagmentSystem;
import java.util.Scanner;
public class Login {
    int userID= 12;
    int userPass = 123;

    Scanner input = new Scanner(System.in);
public void loginDetails(){
    System.out.println("Enter the userId");
    int id = input.nextInt();
    System.out.println("Enter the password");
    int pass = input.nextInt();


    if(id == userID && pass == userPass){
        System.out.println("Login Successfully , welcome Admin");
    }
    else {
        System.out.println("Incorrect  id & password , Try again");
    }
}
}
