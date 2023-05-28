package Inheritance;

public class Tester extends Emlpoyee {
    private float shiftAllowance;

    public float getTesterSalary(){
        return getSalary() + getShiftAllowance();
    }

    public float getShiftAllowance() {
        return shiftAllowance;
    }

    public void setShiftAllowance(float shiftAllowance) {
        this.shiftAllowance = shiftAllowance;
    }
}

