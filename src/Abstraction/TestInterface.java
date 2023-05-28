package Abstraction;

public class TestInterface {
    public static void main(String[] args) {
        Language obj = new Marathi();
        obj.setLanguage();
        obj.getLanguage();

        Language obj2 = new English();
        obj2.getLanguage();
        obj2.setLanguage();
    }
}
