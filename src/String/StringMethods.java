package String;

public class StringMethods {
    public static void main(String[] args) {
        String str = "Jagannath";
        String str2 = "Jagannath";
        String name = new String("jagannath");
        String name2 = new String("jagannath");

        System.out.println(str == name);
        System.out.println(str == str2);
        System.out.println(name == name2);
        System.out.println(str.equals(name));
        System.out.println(str.equalsIgnoreCase(name));
        System.out.println(str.toLowerCase());
        System.out.println(name.toUpperCase());
        System.out.println(str.compareTo(name));
        System.out.println(str.substring(1,5));

        String a = "10";
        String b = "20";
        System.out.println(a.compareTo(b)) ;
        System.out.println(b.compareTo(a)) ;
    }
}
