// Main program
public class Main { // Car Program by Max Brooks
    public static void main(String[] args) {
        // Create one of each type
        Car basicCar = new Car("Toyota Corolla", 2006, "Silver");
        GasCar gasCar = new GasCar("Ford F150", 2015, "Blue", 26.0, 18.0);
        ElectricCar electricCar = new ElectricCar("Tesla Model 3", 2022, "White", 82.0, 4.0);

        // Print original info
        System.out.println("Original Vehicles:");
        System.out.println(basicCar);
        System.out.println(gasCar);
        System.out.println(electricCar);

        // Update attributes
        basicCar.updateCar("Toyota Camry", 2012, "Black");
        gasCar.updateCar("Chevy Silverado", 2018, "Red");
        electricCar.updateCar("Nissan Leaf", 2023, "Silver");

        // Print after updates
        System.out.println("\nAfter Updates:");
        System.out.println(basicCar);
        System.out.println(gasCar);
        System.out.println(electricCar);

        // Show custom methods
        System.out.println("\nVehicle Details:");
        gasCar.displayFuelRange();
        electricCar.displayChargeRange();
    }
}

// Base class
class Car implements Comparable<Car> {
    protected String name;
    protected int year;
    protected String color;

    public Car(String name, int year, String color) {
        this.name = name;
        this.year = year;
        this.color = color;
    }

    public void updateCar(String newName, int newYear, String newColor) {
        this.name = newName;
        this.year = newYear;
        this.color = newColor;
    }

    @Override
    public int compareTo(Car other) {
        // Compare cars by year
        return Integer.compare(this.year, other.year);
    }

    @Override
    public String toString() {
        return color + " " + name + " (Manufactured in " + year + ")";
    }
}

// Subclass 1 – Gas Car
class GasCar extends Car {
    private double tankSize; // in gallons
    private double mpg; // miles per gallon

    public GasCar(String name, int year, String color, double tankSize, double mpg) {
        super(name, year, color);
        this.tankSize = tankSize;
        this.mpg = mpg;
    }

    public void setTankSize(double tankSize) {
        this.tankSize = tankSize;
    }

    public void setMpg(double mpg) {
        this.mpg = mpg;
    }

    public double calculateRange() {
        return tankSize * mpg;
    }

    public void displayFuelRange() {
        System.out.println(name + " can travel about " + calculateRange() + " miles on a full " + tankSize + "-gallon tank.");
    }

    @Override
    public String toString() {
        return super.toString() + " | GasCar: " + tankSize + " gal tank, " + mpg + " mpg";
    }
}

// Subclass 2 – Electric Car
class ElectricCar extends Car {
    private double batterySize; // in kWh
    private double milesPerKWh; // efficiency

    public ElectricCar(String name, int year, String color, double batterySize, double milesPerKWh) {
        super(name, year, color);
        this.batterySize = batterySize;
        this.milesPerKWh = milesPerKWh;
    }

    public void setBatterySize(double batterySize) {
        this.batterySize = batterySize;
    }

    public void setMilesPerKWh(double milesPerKWh) {
        this.milesPerKWh = milesPerKWh;
    }

    public double calculateRange() {
        return batterySize * milesPerKWh;
    }

    public void displayChargeRange() {
        System.out.println(name + " can travel about " + calculateRange() + " miles on a full charge of " + batterySize + " kWh.");
    }

    @Override
    public String toString() {
        return super.toString() + " | ElectricCar: " + batterySize + " kWh battery, " + milesPerKWh + " mi/kWh";
    }
}

