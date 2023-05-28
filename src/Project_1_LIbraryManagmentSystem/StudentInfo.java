package Project_1_LIbraryManagmentSystem;
import java.util.Scanner;
public class StudentInfo {
    int totalStudent = 2;
    String name []= new String[totalStudent];
    int rno []= new int[totalStudent];

    Scanner input = new Scanner(System.in);

    public void AddStudent(){
        System.out.println("Add the student name and roll number:");
        System.out.println();

        for(int i=0; i<totalStudent; i++){
            System.out.print("Enter the Student roll number:");
            rno [i]= input.nextInt();

            System.out.print("Enter the Student name:");
            name [i] = input.next();
        }
        System.out.println();
        System.out.println("Data saves Successfully");

        AdminPage obj = new AdminPage();
        obj.adminPage();
    }

    public void ShowStudent(){
        System.out.println("Students names and roll number are:");

        for(int i=0; i<name.length; i++) {
            System.out.println(rno[i]);
            System.out.println(name[i]);
            System.out.println();

        }

    }



}
