package Abstraction;

public class Marathi implements Language{

    @Override
    public void setLanguage() {
        System.out.println("Inside the marathi set language");
    }

    @Override
    public void getLanguage() {
        System.out.println("Inside the marathi get language");


    }
}
