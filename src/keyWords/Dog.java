package keyWords;

public class Dog extends Animal{
    Dog(){
        System.out.println("Inside the dog constructor");

    }
    void display(){
        System.out.println("Inside the display of dog class ");
    }
    void printMessage(){
        System.out.println("msg inside the dog");
        display();
    }

    public static void main(String[] args) {
    Animal obj = new Animal();
    obj.display();
    
    }
}
