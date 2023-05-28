package Inheritance;

public class SoftWareDeveloper extends Emlpoyee  {
    private float carAllowance;

    public float getSwDeveloperSalary(){
        return getCarAllowance() + getSalary();
    }

    public float getCarAllowance() {
        return carAllowance;
    }

    public void setCarAllowance(float carAllowance) {
        this.carAllowance = carAllowance;
    }
}
