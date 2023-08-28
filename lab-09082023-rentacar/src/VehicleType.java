// Enumeration representing different types of vehicles
public enum VehicleType {
    TRUCK(/* Add minimum license year */, /* Add error message */),
    VAN(/* Add minimum license year */, /* Add error message */),
    CAR(/* Add minimum license year */, /* Add error message */);

    private final int minLicenceYear;   // Minimum required license year for this vehicle type
    private final String errorMessage;  // Error message for license requirement

    // Constructor for VehicleType enum
    VehicleType(int minLicenceYear, String errorMessage) {
        this.minLicenceYear = minLicenceYear;
        this.errorMessage = errorMessage;
    }

    // Get the minimum required license year for this vehicle type
    public int getMinLicenceYear() {
        return minLicenceYear;
    }

    // Get the error message for license requirement
    public String getErrorMessage() {
        return errorMessage;
    }
}