// Class definition
class Car {
    // Attributes (fields)
    String brand;
    String model;
    int year;

    // Method to display car details
    void displayDetails() {
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Year: " + year);
    }
}

public class Main {
    public static void main(String[] args) {
        // Create first car object
        Car car1 = new Car();
        car1.brand = "Toyota";
        car1.model = "Camry";
        car1.year = 2020;

        // Create second car object
        Car car2 = new Car();
        car2.brand = "Honda";
        car2.model = "Civic";
        car2.year = 2018;

        // Display details of car1
        System.out.println("Car 1 Details:");
        car1.displayDetails();

        System.out.println();

        // Display details of car2
        System.out.println("Car 2 Details:");
        car2.displayDetails();
    }
}
