import java.math.BigDecimal;
import java.util.UUID;

// Abstract class representing a vehicle
public abstract class Vehicle {
    private final String vehicleId;           // Unique identifier for the vehicle
    private int year;                         // Manufacturing year of the vehicle
    private String brand;                     // Brand of the vehicle
    private VehicleType vehicleType;           // Type of the vehicle
    private BigDecimal pricePerDay;           // Price per day for renting the vehicle
    private boolean isAvailable = true;        // Availability status of the vehicle
    private Customer customer;                // Customer who rented the vehicle
    private BigDecimal totalPrice = BigDecimal.ZERO;  // Total price of the rental
    private int countOfRentDay;               // Number of days the vehicle is rented

    // Constructor for Vehicle class
    public Vehicle(int year, String brand, VehicleType vehicleType, BigDecimal pricePerDay) {
        this.vehicleId = UUID.randomUUID().toString();
        this.year = year;
        this.brand = brand;
        this.vehicleType = vehicleType;
        this.pricePerDay = pricePerDay;
    }

    // Method to rent the vehicle to a customer for a specified number of days
    public void rent(Customer customer, int countOfRentDay) {
        if (!isAvailable) {
            System.out.println(vehicleId + " id'li araç şuan müsait değil!"); // Vehicle is not available for rent
            return;
        }
        if (customer.getLicenceYear() < vehicleType.getMinLicenceYear()) {
            System.out.println(vehicleType.getErrorMessage()); // Customer doesn't meet license requirements
            return;
        }
        // Add code here
        // Calculate rental price
        // Update attributes: countOfRentDay, totalPrice, isAvailable, customer
        // Print rental information
    }

    // Abstract method for returning the vehicle (to be implemented in subclasses)
    public abstract void returnVehicle();

    // Getter for vehicleId attribute
    public String getVehicleId() {
        return vehicleId;
    }

    // Getter and setter for year attribute
    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    // Getter and setter for brand attribute
    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    // Getter and setter for vehicleType attribute
    public VehicleType getVehicleType() {
        return vehicleType;
    }

    public void setVehicleType(VehicleType vehicleType) {
        this.vehicleType = vehicleType;
    }

    // Getter and setter for pricePerDay attribute
    public BigDecimal getPricePerDay() {
        return pricePerDay;
    }

    public void setPricePerDay(BigDecimal pricePerDay) {
        this.pricePerDay = pricePerDay;
    }

    // Getter for isAvailable attribute
    public boolean isAvailable() {
        return isAvailable;
    }

    // Setter for isAvailable attribute
    public void setAvailable(boolean available) {
        isAvailable = available;
    }

    // Getter and setter for customer attribute
    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    // Getter and setter for totalPrice attribute
    public BigDecimal getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(BigDecimal totalPrice) {
        this.totalPrice = totalPrice;
    }

    // Getter and setter for countOfRentDay attribute
    public int getCountOfRentDay() {
        return countOfRentDay;
    }

    public void setCountOfRentDay(int countOfRentDay) {
        // Add comment here
    }
}
