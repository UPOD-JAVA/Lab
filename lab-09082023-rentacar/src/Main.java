public class Main {
    public static void main(String[] args) {
        Service service = new Service();  // Create an instance of the Service class
        service.generateVehiclesAndCustomers();  // Generate vehicles and customers

        // Debugging values
        String customerId = "1";       // Replace with an actual customer ID
        String vehicleId = "1";        // Replace with an actual vehicle ID
        int day = 5;                   // Number of rental days

        service.rentVehicle(vehicleId, customerId, day);  // Rent a vehicle
    }
}