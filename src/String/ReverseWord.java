package String;

public class ReverseWord {
    public static void main(String[] args) {
        String str = "Java Concept Of The Day";
        for (int i = str.length(); i>0 ; i--){
            System.out.print(str.charAt(i-1));
        }
    }
}
