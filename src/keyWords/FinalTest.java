package keyWords;

public class FinalTest extends FinalKw {
    public static void main(String[] args) {

        FinalKw obj = new FinalKw();
        obj.m1();
        obj.m2();
    }

    @Override
    public void m2() {
        System.out.println("inside the m2 method by over ride");
    }
}
