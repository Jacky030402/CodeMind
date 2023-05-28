package Project_1_LIbraryManagmentSystem;
import java.util.Scanner;
public class LibraryProject {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        WelcomePage obj = new WelcomePage();
        obj.userLogin();

        AdminPage obj1 = new AdminPage();
        obj1.adminPage();



    }
}
