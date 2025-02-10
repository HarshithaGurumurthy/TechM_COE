import java.util.*;
class Car {
    private String make, model;
    private int year;
    public Car(String make, String model, int year) {
        this.make = make;
        this.model = model;
        this.year = year;
    }
    public String getMake() { return make; }
    public void setMake(String make) { this.make = make; }
    public String getModel() { return model; }
    public void setModel(String model) { this.model = model; }
    public int getYear() { return year; }
    public void setYear(int year) { this.year = year; }

    public void startEngine() {
        System.out.println("The car's engine has started.");
    }
}
class ElectricCar extends Car {
    private int batteryRange;

    public ElectricCar(String make, String model, int year, int batteryRange) {
        super(make, model, year);
        this.batteryRange = batteryRange;
    }

    public int getBatteryRange() { return batteryRange; }
    public void setBatteryRange(int batteryRange) { this.batteryRange = batteryRange; }
    public void chargeBattery() {
        System.out.println("The battery is being charged.");
    }
    @Override
    public void startEngine() {
        System.out.println("The electric car's engine has started silently.");
    }
}
public class Main {
    public static void main(String[] args) {
        Car[] cars = {
                new Car("Toyota", "Corolla", 2020),
                new ElectricCar("Tesla", "Model S", 2022, 400)
        };
        for (Car car : cars) {
            car.startEngine();
        }
    }
}

