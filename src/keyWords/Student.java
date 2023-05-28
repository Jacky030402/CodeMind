package keyWords;

public class Student {
    String name;
    int rno;
    String add;


    public void saveStudent(int rno, String name, String add) {

         this.rno = rno;
         this.name = name;
         this.add= add;
        System.out.println("save student data in database: " + rno + " " + name + " " + add);

        validateStudentRno();
    }

    void validateStudentRno() {
        if (rno >= 1) {
            System.out.println("roll number are correct");
        } else {
            System.out.println("incorrect rno");
        }
    }
}