package vehicles;

public class Truck extends Vehicle {
    private final double payload;

    public Truck(String brand, int year, double payload) {
        super(brand, year);
        this.payload = payload;
    }

    @Override
    public void describe() {
        System.out.println("Truck: " + getBrand() + " (" + getYear() + ") with payload capacity of " + payload + " tons");
    }

    @Override
    public double fuelCost() {
        return 0.25; // Cost per unit of fuel for a truck
    }

    @Override
    public int maxSpeed() {
        return 120; // Max speed for a truck in km/h`
   }

    public double getPayload() {
        return payload;
    }

}