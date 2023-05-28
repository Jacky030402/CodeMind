package Encapusulation;

public class Car {
    private String model;
    private String Company;
    private  int speed;

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getCompany() {
        return Company;
    }

    public void setCompany(String company) {
        Company = company;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        if(speed>=0){
            this.speed = speed;
        }
        else {
            System.out.println("given speed is incorrect");
            this.speed = 0;
        }
    }
}
