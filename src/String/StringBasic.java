package String;

public class StringBasic {
    public static void main(String[] args) {
        String s = "jagannath";
        String s1 = "jagannath";
        String obj2 = new String("jack");
        String obj3 = new String("jack");

        System.out.println(s);
        //System.out.println(obj);
        boolean obj = (s == s1);
        System.out.println(obj);
        boolean obj5 = (obj2 == obj3);
        System.out.println(obj5);

        System.out.println("check in GitHub");
        
    }
}
