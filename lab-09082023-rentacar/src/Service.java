import java.math.BigDecimal;

// Service class responsible for managing vehicle rentals
public class Service {
    public static int a = 5;  // Example variable

    // Array to store vehicles and customers
    public final Vehicle[] VEHICLE_LIST = new Vehicle[9];
    public final Customer[] CUSTOMER_LIST = new Customer[3];

    // Method to generate sample vehicles and customers
    public void generateVehiclesAndCustomers() {
        // Add code here
        // Create instances of vehicles and customers and store them in arrays
    }

    // Method to rent a vehicle to a customer
    public void rentVehicle(String vehicleId, String customerId, int countOfDay) {
        // Add code here
        // Get the selected vehicle and customer
        // Rent the vehicle to the customer for the specified number of days
    }

    // Method to return a rented vehicle
    public void returnVehicle(String vehicleId) {
        // Add code here
        // Get the selected vehicle and return it
    }

    // Helper method to get a vehicle by its ID
    private Vehicle getVehicle(String vehicleId) {
        // Add code here
        // Iterate through the VEHICLE_LIST and find the vehicle by ID
    }

    // Helper method to get a customer by their ID
    private Customer getCustomer(String customerId) {
        // Add code here
        // Iterate through the CUSTOMER_LIST and find the customer by ID
    }
}