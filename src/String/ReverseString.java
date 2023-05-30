package String;

public class ReverseString {
    public static void main(String[] args) {
        String str = "MyJava";
        for (int i = str.length(); i > 0; i--) {
            System.out.print(str.charAt(i - 1));
        }
    }
}