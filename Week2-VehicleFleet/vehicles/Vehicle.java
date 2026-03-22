package vehicles;

public abstract class Vehicle {
    private final String brand;
    private final int year;
    protected double fuelLevel;


    public Vehicle(String brand, int year) {
        this.brand = brand;
        this.year = year;
        fuelLevel = 100.0;
    }


    public abstract void describe();
       
    public abstract double fuelCost();

    public abstract int maxSpeed();
    public void refuel() {
       fuelLevel = 100.0;
        System.out.println(brand + " refuelled");
    }

    public String getBrand() {
        return brand;
    }
    public int getYear() {
        return year;
    }

    @Override
    public String toString() {
        return String.format("Vehicle[%s | %d | fuel:%.1f%%]", brand, year, fuelLevel);
    }
}