package Project_1_LIbraryManagmentSystem;
import java.util.Scanner;
public class DisplayControl extends StudentInfo {

    Scanner input = new Scanner(System.in);

    public void bookManage(){
        System.out.println("** Manage Book Page **");

        System.out.println(1 + " Issue Book");
        System.out.println(2 + " Return Book");
        System.out.println(3 + " Exit");

        System.out.println("Enter any option");
        int option = input.nextInt();

        if(option ==1){
            BooksInfo obj = new BooksInfo();
            obj.issueBooks();
        }
        else if(option == 2){
            BooksInfo obj = new BooksInfo();
            obj.bookretrun();
        }
        else if (option== 3) {
           // System.exit(0);
            AdminPage obj = new AdminPage();
            obj.adminPage();

        }
    }
    public void studentPage(){
        System.out.println("** Student Page **");

        System.out.println(1 + " Add Student");
        System.out.println(2 + " Display Student");
        System.out.println(3 + " Exit");

        System.out.println("Enter any option");
        int option = input.nextInt();
        if(option == 1){
            StudentInfo obj = new StudentInfo();
            obj.AddStudent();
        }
        else if( option ==2){
            StudentInfo obj = new StudentInfo();
            obj.ShowStudent();
        }
        else if (option ==3){
            AdminPage obj = new AdminPage();
            obj.adminPage();
        }
    }
    public void bookPage(){
        System.out.println("**Book Page**");

        System.out.println(1+" Add book");
        System.out.println(2+ " Display Book");
        System.out.println(3+ "exit");
        System.out.println("Enter the option");
        int option=input.nextInt();
        if(option==1){
            BooksInfo Obj=new BooksInfo();
            Obj.addBooks();
        }
        else if(option==2){
            BooksInfo Obj=new BooksInfo();
            Obj.showBooks();
        }
        else if(option==3){
            AdminPage obj = new AdminPage();
            obj.adminPage();
        }
    }
    public void manageBookPage(){
        System.out.println("** Manage Book Page **");
        System.out.println(1+ " Issue Book");
        System.out.println(2+ " Return Book");
        System.out.println(3+ " Exit");

        System.out.println("Enter the option");
        int option = input.nextInt();

        if(option == 1){
            BooksInfo obj = new BooksInfo();
            obj.issueBooks();
        }
        else if(option ==2 ){
            BooksInfo obj = new BooksInfo();
            obj.bookretrun();
        }
        else if(option == 3){
            AdminPage obj = new AdminPage();
            obj.adminPage();
        }
    }

}
