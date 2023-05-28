package Abstraction;

public class English implements Language{

    @Override
    public void setLanguage() {
        System.out.println("Inside the English set language");
    }

    @Override
    public void getLanguage() {
        System.out.println("Inside the English get language");

    }
}
