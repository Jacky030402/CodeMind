package String;

public class StrMethods2 {
    public static void main(String[] args) {
        String str = "My name is Jagannath";

        String [] result = str.split(" ");
        for(int i = 0; i<str.length();i++) {
            System.out.println(result[i]);
        }
    }
}
