package vehicles;

public class Motorcycle extends Vehicle {
    private final boolean hasSideCar;


    public Motorcycle(String brand, int year, boolean hasSideCar) {
        super(brand, year);
        this.hasSideCar = hasSideCar;

    }

    @Override
    public void describe() {
        System.out.println("Motorcycle: " + getBrand() + " (" + getYear() + ") with " + (hasSideCar ? "Yes has side car" : "No side car")
          );
    }

    @Override
    public double fuelCost() {
        return 0.05; // Cost per unit of fuel for a motorcycle

    }

    @Override
    public int maxSpeed() {
        return 250; // Max speed for a motorcycle in km/h
    }


    public boolean getHasSideCar() {
        return hasSideCar;
    }
}