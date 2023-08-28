import java.math.BigDecimal;

// Van class that extends the Vehicle class (inherits its attributes and methods)
public class Van extends Vehicle {
    // Constructor for Van class
    public Van(int year, String brand, BigDecimal pricePerDay) {
        // Add constructor code here
        // Call the constructor of the parent class (Vehicle)
        // to initialize the common attributes
    }

    // Override method from the parent class (Vehicle)
    @Override
    public void returnVehicle() {
        // Add code here
        // Mark the vehicle as available
        // Clear customer and reset total price
    }
}
