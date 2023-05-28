package ArrayANDbasic;

public class ArrayBasic {
    public static void main(String[] args) {
        int rno1 = 1;
        int rno2 = 2;
        int rno3 = 3;

        int []sRno = new int [5];
        sRno[0] = 1;
        sRno[1] = 2;
        sRno[2] = 3;
        sRno[3] = 4;
        sRno[4] = 5;

        System.out.println(sRno[1]);

        for (int i = 0; i<sRno.length ; i++){
            System.out.println("roll number values " + sRno[i]);

            Student [] sArray = new Student[5];
            Student Sobj = new Student();
            Sobj.setRno(1);
            Sobj.setName("jagannath");
            sArray[0] = Sobj;




        }
    }
}
