package Project_1_LIbraryManagmentSystem;
import java.util.Scanner;
public class BooksInfo {
    int totalBooks = 5;
    String bookNames[]= new String[totalBooks];

   Scanner input = new Scanner (System.in);

   public void addBooks(){
       System.out.println("Add the books");

       for(int i= 0; i<totalBooks; i++){
           System.out.println(i+1  + " Enter the book names:");
            bookNames[i] = input.next();
       }

   }
    public void showBooks(){
        System.out.println("Books available at library are:");
        for(int i = 0; i<totalBooks; i++){
            System.out.println(i + ")"+ bookNames[i]);
        }
    }
    public void issueBooks(){
        System.out.println("Issue book to student");
        System.out.println("Enter the Roll Number of student");
        input.nextInt();
        System.out.println("Enter the book name");
        input.nextLine();
        input.nextLine();
    }
    public void bookretrun(){
        System.out.println("Return the book");
        System.out.println("Enter the Roll number");
        input.nextInt();
        System.out.println("Enter the book name");
        input.nextLine();
        input.nextLine();
    }
}
