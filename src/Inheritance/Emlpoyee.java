package Inheritance;

public class Emlpoyee {
//    void saveEmployee(){
//        System.out.println("logic of class employee");
//    }
//    void getEmployee(){
//        System.out.println("logic of getEmployee");
//    }

    private int id ;
    private String name;
    private int moNo;
    private int salary;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMoNo() {
        return moNo;
    }

    public void setMoNo(int moNo) {
        this.moNo = moNo;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }
}
