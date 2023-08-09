import java.math.BigDecimal;

public class Service {

    public static int a = 5;
    public  final Vehicle[] VEHICLE_LIST = new Vehicle[9];
    public  final Customer[] CUSTOMER_LIST = new Customer[3];

    public  void generateVehiclesAndCustomers() {
        VEHICLE_LIST[0] = new Car(2020, "Mercedes C-200", BigDecimal.valueOf(300), true);
        VEHICLE_LIST[1] = new Car(2018, "Toyota Corolla", BigDecimal.valueOf(250), true);
        VEHICLE_LIST[2] = new Car(2019, "Egea Cross", BigDecimal.valueOf(200), false);
        VEHICLE_LIST[3] = new Car(2019, "Clio", BigDecimal.valueOf(150), false);
        VEHICLE_LIST[4] = new Truck(2022, "Kamaz", BigDecimal.valueOf(5000));
        VEHICLE_LIST[5] = new Truck(2022, "Mercedes UNIMOG", BigDecimal.valueOf(6000));
        VEHICLE_LIST[6] = new Truck(2022, "Ford Cargo", BigDecimal.valueOf(4000));
        VEHICLE_LIST[7] = new Van(2023, "Mercedes Benz Vito", BigDecimal.valueOf(500));
        VEHICLE_LIST[8] = new Van(2022, "Mercedes Benz Vito", BigDecimal.valueOf(400));

        CUSTOMER_LIST[0] = new Customer("Ahmet", "Gültekin", 7);
        CUSTOMER_LIST[1] = new Customer("Asım", "Kılıç", 1);
        CUSTOMER_LIST[2] = new Customer("Emre", "Yılmaz", 2);
    }

    public void rentVehicle(String vehicleId, String customerId, int countOfDay) {
        Vehicle vehicle = getVehicle(vehicleId);
        Customer customer = getCustomer(customerId);

        if (vehicle != null && customer != null) {
            vehicle.rent(customer, countOfDay);
        } else {
            System.out.println("Hatalı bilgi girişi");
        }
    }

    public  void returnVehicle(String vehicleId) {
        Vehicle vehicle = getVehicle(vehicleId);
        if (vehicle != null) {
            vehicle.returnVehicle();
        }
    }

    private  Vehicle getVehicle(String vehicleId) {
        for (Vehicle vehicle : VEHICLE_LIST) {
            if (vehicle.getVehicleId().equalsIgnoreCase(vehicleId)) {
                return vehicle;
            }
        }
        return null;
    }

    private  Customer getCustomer(String customerId) {
        for (Customer customer : CUSTOMER_LIST) {
            if (customer.getCustomerId().equalsIgnoreCase(customerId)) {
                return customer;
            }
        }
        return null;
    }
}
