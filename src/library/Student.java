package library;

public class Student {
    public int rno = 16;
    public String name = "Jagannath autade";
      private String moNo = "8605356105";
      protected String adress = "pathkal";
    public Student(){
        System.out.println("Inside the public class and ArrayANDbasic.Student constructor");
   //  ArrayANDbasic.Student -- is a constructor
        }
    public void getstudent(){
        System.out.println("inside the getstudent method");
    }
    private void displayStuden(){
        System.out.println("inside the DisplayStudent method");
    }

    public String getMoNo() {
        return moNo;
    }

    public void setMoNo(String moNo) {
        this.moNo = moNo;
    }

    public static void main(String[] args) {
        Student data = new Student();
        System.out.println(data.moNo);
        data.displayStuden();
        System.out.println(data.getMoNo());

    }
}
