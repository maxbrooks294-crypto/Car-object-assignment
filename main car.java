public class Main { // Car Program by Max Brooks
    public static void main(String[] args) {
        // Create three Car objects
        Car car1 = new Car("Toyota Corolla", 2006, "Silver");
        Car car2 = new Car("Ford F150", 2010, "Blue");
        Car car3 = new Car("Chevy Silverado", 2016, "Red");

        // Print out the original cars
        System.out.println("Original Cars:");
        System.out.println(car1);
        System.out.println(car2);
        System.out.println(car3);

        // Use the updateCar method to change their attributes
        car1.updateCar("Toyota Camry", 2012, "Black");
        car2.updateCar("Ford Ranger", 2015, "Green");
        car3.updateCar("Chevy Colorado", 2018, "White");

        // Print the cars after updates
        System.out.println("\nAfter Updates:");
        System.out.println(car1);
        System.out.println(car2);
        System.out.println(car3);

        // Have the cars perform behaviors
        System.out.println("\nCars in action:");
        car1.drive();
        car2.honk();
        car3.drive();
        car3.honk();
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

    // New behavior methods
    public void drive() {
        System.out.println(name + " is driving!");
    }

    public void honk() {
        System.out.println(name + " goes Beep Beep!");
    }

    // Method to display car info
    public String toString() {
        return color + " " + name + " (Manufactured in " + year + ")";
    }
}
