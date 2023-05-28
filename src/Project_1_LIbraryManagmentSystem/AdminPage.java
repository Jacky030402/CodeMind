package Project_1_LIbraryManagmentSystem;

import java.util.Scanner;

public class AdminPage {

Scanner input = new Scanner(System.in);

    public void adminPage(){

        System.out.println(1 + " Student Record");
        System.out.println(2 + " Books Record");
        System.out.println(3 + " Manage Books");
        System.out.println(4 + " Exit");

        System.out.println("Enter any option");
        int option = input.nextInt();

        if(option==1){
            DisplayControl obj = new DisplayControl();
            obj.studentPage();
        }
        else if(option == 2){
            BooksInfo obj = new BooksInfo();
            obj.showBooks();
        }
        else if (option == 3){
            AdminPage obj = new AdminPage();
            obj.adminPage();


        }

    }
}
