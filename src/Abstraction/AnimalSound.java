package Abstraction;

public  class AnimalSound {
    public static void main(String[] args) {
    Animals obj = new cat();
    obj.eat();
    obj.sound();

    Animals obj2 = new dog();
    obj2.sound();
    obj2.eat();
    }
}


    abstract class Animals{
    public void eat(){
        System.out.println(" eating ...");
    }
    abstract void sound();

}
class cat extends Animals{

    @Override
    void sound() {
        System.out.println("sound of car  meeeooww");
    }
}
class dog extends Animals{
    void sound(){
        System.out.println("sound of dog bhoo bhooo");
    }
}

