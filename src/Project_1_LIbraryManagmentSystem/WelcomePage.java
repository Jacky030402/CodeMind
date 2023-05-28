package Project_1_LIbraryManagmentSystem;

import java.util.Scanner;

public class WelcomePage {
    Scanner input  = new Scanner(System.in);

    public void userLogin() {
        System.out.println("*** Library Management Application ***");


        System.out.println(1 + " Login");
        System.out.println(2 + " Sign Up");
        System.out.println(3 + " Exit");

        System.out.println("Enter any option:");
        int option = input.nextInt();
        if ( option==1){
            Login obj  = new Login();
            obj.loginDetails();
        }
        else if (option ==2) {
            System.out.println("enter your details here");
        }
        else if (option==3) {
            //System.exit(0);
            WelcomePage obj = new WelcomePage();
            obj.userLogin();


        }
    }
}

