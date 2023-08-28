import java.math.BigDecimal;
import java.text.MessageFormat;

// Truck class that extends the Vehicle class (inherits its attributes and methods)
public class Truck extends Vehicle {
    // Constructor for Truck class
    public Truck(int year, String brand, BigDecimal pricePerDay) {
        // Add constructor code here
        // Call the constructor of the parent class (Vehicle)
        // to initialize the common attributes
    }

    // Override method from the parent class (Vehicle)
    @Override
    public void rent(Customer customer, int countOfRentDay) {
        // Add code here
        // Check if the rental days are above the minimum limit
        // If valid, proceed with renting using super.rent(...)
    }

    // Override method from the parent class (Vehicle)
    @Override
    public void returnVehicle() {
        // Add code here
        // Mark the vehicle as available
        // Clear customer and reset total price
    }
}