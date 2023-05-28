package Abstraction;

public class C implements A,B{

    @Override
    public void m() {
        System.out.println("MUltiple inheritance of interfaces");
    }

    public static void main(String[] args) {
        A obj = new C();
        obj.m();
    }
}
