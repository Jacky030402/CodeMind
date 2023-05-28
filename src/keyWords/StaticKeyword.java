package keyWords;

public class StaticKeyword {
 public int a=12;
static int b=10;

public void m1(){
    System.out.println("inside the m1 method non static");

    System.out.println(a);
    System.out.println(b);
}
StaticKeyword(){
    System.out.println("inside constructor (outside the main method)");
}
static void m2(){
    System.out.println("Inside the m2 method Static");
    System.out.println(b);
}
static {
    b=15;
    System.out.println("inside the static block 1");
}
static {
    System.out.println("inside the static block 2");
}
    {
        System.out.println("inside non static block 1");
    }
    StaticKeyword(int  a){
        System.out.println("inside 2nd constructor");
    }


    public static void main(String[] args) {
        m2();
        StaticKeyword m = new StaticKeyword();
        m.m1();

        StaticKeyword obj = new StaticKeyword();
        


    }


}
