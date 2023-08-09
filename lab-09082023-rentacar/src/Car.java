import java.math.BigDecimal;

public class Car extends Vehicle {
    private boolean hasChildSeat;
    private Customer secondCustomer;

    public Car(int year,
               String brand,
               BigDecimal pricePerDay,
               boolean hasChildSeat) {
        super(year, brand, VehicleType.CAR, pricePerDay);
        this.hasChildSeat = hasChildSeat;
    }

    public boolean isHasChildSeat() {
        return hasChildSeat;
    }

    public void setHasChildSeat(boolean hasChildSeat) {
        this.hasChildSeat = hasChildSeat;
    }

    public Customer getSecondCustomer() {
        return secondCustomer;
    }

    public void setSecondCustomer(Customer secondCustomer) {
        this.secondCustomer = secondCustomer;
    }

    @Override
    public void returnVehicle() {
        setAvailable(true);
        setCustomer(null);
        secondCustomer = null;
        setTotalPrice(BigDecimal.ZERO);
    }

    public void addSecondCustomer(Customer customer) {
        if (getCustomer() == customer) {
            System.out.println("Lütfen farklı bir sürücü seçiniz");
            return;
        }
        this.secondCustomer = secondCustomer;
        var finalPrice = getTotalPrice().add(BigDecimal.valueOf(100));
        setTotalPrice(finalPrice);
    }
}
