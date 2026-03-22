import vehicles.Vehicle;
import vehicles.Car;
import vehicles.Motorcycle;
import vehicles.Truck;
import java.util.List;
import java.util.ArrayList;

public class Main {
    public static void main (String[] args) {

        List<Vehicle> fleet = new ArrayList<>();
        fleet.add(new Car("Toyota", 2020, 4));
        fleet.add(new Car("Honda", 2018, 2));
        fleet.add(new Truck("Volvo", 2019, 1000));
        fleet.add(new Truck("Scania", 2020, 1500));  
        fleet.add(new Motorcycle("Yamaha", 2021, false)); 
         


        System.out.println("----Fleet----:");
           fleet.forEach(v -> v.describe());


         System.out.println("\n--- Fuel costs ---");
          fleet.forEach(v -> System.out.println(
          v.getBrand() + ": $" + v.fuelCost() + " per km"));


          System.out.println("\n--- Fastest vehicle ---");
          Vehicle fastest = fleet.get(0);
          for (Vehicle v : fleet) {
            if(v.maxSpeed() > fastest.maxSpeed()) {
                fastest = v;
            }
          }
            System.out.println("Fastest: " + fastest.getBrand() + " with max speed of " + fastest.maxSpeed() + " km/h");


          System.out.println("\n--- Vehicle details ---");
          for(Vehicle v : fleet) {
            if (v instanceof Car car) {
                System.out.println(car.getDoors() + " doors");
            } else if (v instanceof Truck truck) {
                System.out.println(truck.getPayload() + " tons payload");
            }
          }
        }
    }
