import java.math.BigDecimal;

// Car class that extends the Vehicle class (inherits its attributes and methods)
public class Car extends Vehicle {
    private boolean hasChildSeat;       // Additional attribute specific to Car class
    private Customer secondCustomer;    // Additional attribute specific to Car class

    // Constructor for Car class
    public Car(int year, String brand, BigDecimal pricePerDay, boolean hasChildSeat) {
        // Add super(...) here
        // Initialize Car-specific attributes without "this."
    }

    // Getter and setter for hasChildSeat attribute
    // ...

    // Getter and setter for secondCustomer attribute
    // ...

    // Override method from the parent class (Vehicle)
    @Override
    public void returnVehicle() {
        // Add code here
        // Mark the vehicle as available
        // Clear both customers and reset total price
    }

    // Method specific to Car class
    public void addSecondCustomer(Customer customer) {
        // Add code here
        // Check if the same customer is already the first driver
        // Update second customer and adjust the final price
    }
}
