// Car Program by Max Brooks
// This program creates Car objects with name, year, and color attributes.
// It uses a method to change the car's details instead of directly modifying them.

public class Main {
    public static void main(String[] args) {
        // Create three Car objects
        Car car1 = new Car("Toyota Corolla", 2006, "Silver");
        Car car2 = new Car("Ford F150", 2010, "Blue");
        Car car3 = new Car("Chevy Silverado", 2016, "Red");

        // Print out the cars
        System.out.println("Original Cars:");
        System.out.println(car1);
        System.out.println(car2);
        System.out.println(car3);

        // Use the behavior (method) to change one car's attributes
        car1.updateCar("Toyota Camry", 2012, "Black");

        // Print after the update
        System.out.println("\nAfter Update:");
        System.out.println(car1);
    }
}

// Car class definition
class Car {
    // Attributes
    private String name;
    private int year;
    private String color;

    // Constructor
    public Car(String name, int year, String color) {
        this.name = name;
        this.year = year;
        this.color = color;
    }

    // Behavior (method) that changes the attributes
    public void updateCar(String newName, int newYear, String newColor) {
        this.name = newName;
        this.year = newYear;
        this.color = newColor;
    }

    // Method to display car info
    public String toString() {
        return color + " " + name + " (Manufactured in " + year + ")";
    }
}

