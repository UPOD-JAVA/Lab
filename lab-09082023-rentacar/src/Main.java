public class Main {
    public static void main(String[] args) {
        Service service = new Service();
        service.generateVehiclesAndCustomers();
        // debug ile araya girmek için ekledik.
        String customerId = "1";
        String vehicleId = "1";
        int day = 5;
        service.rentVehicle(vehicleId, customerId, day);

    }
}