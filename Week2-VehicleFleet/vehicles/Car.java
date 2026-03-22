package vehicles;


public class Car extends Vehicle {
    private final int doors;

    public Car(String brand, int year, int doors) {
        super(brand, year);
        this.doors = doors;
    }


    @Override
    public void describe() {
        System.out.println("Car: " + getBrand() + " (" + getYear() + ") with " + doors + " doors");
    }

    @Override

    public double fuelCost() {
        return 0.08; // Cost per unit of fuel for a car
    }


    @Override

    public int maxSpeed() {
        return 180; // Max speed for a car in km/h
    }

    public int  getDoors() {
        return doors;
    }





}
