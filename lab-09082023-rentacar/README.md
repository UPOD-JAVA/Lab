## Rent A Car Project

This project is an implementation of a vehicle rental system. The system includes classes to represent various entities such as vehicles, customers, and a service for managing the rental operations. Here's a high-level overview of what the project does:

    Entities and Their Relationships:
        The project defines three main classes for the entities: Vehicle, Customer, and VehicleType.
        Vehicles are categorized into different types (car, truck, van) represented by the VehicleType enum.
        Customers can rent vehicles and are associated with their own information such as name, surname, and license year.

    Inheritance and Polymorphism:
        The Vehicle class is an abstract base class that provides common attributes and behaviors for all types of vehicles.
        Specific vehicle types (car, truck, van) inherit from the Vehicle class, allowing them to share common properties and methods while also having their own unique characteristics.
        Polymorphism is used when calling the rent method on different vehicle types, enabling dynamic behavior based on the specific subclass.

    Rental Process:
        The Service class serves as the main interface for managing vehicle rentals.
        It initializes a list of vehicles and customers and provides methods to rent and return vehicles.
        The rentVehicle method allows a customer to rent a vehicle for a specific number of days. It checks availability, customer eligibility, and calculates the rental price.
        The returnVehicle method allows a rented vehicle to be returned, updating its availability and resetting relevant data.

    Constants and Error Handling:
        The DomainConstants class contains constants used in the project. For example, it defines the minimum rental day count for trucks.
        The VehicleType enum includes error messages associated with each vehicle type, which are used for displaying informative messages during the rental process.

    Unique Identifiers:
        The UUID class is used to generate unique identifiers for customers and vehicles.

    Main Class:
        The Main class contains the main method where the program starts.
        It creates an instance of the Service class, generates initial vehicle and customer data, and performs a sample vehicle rental operation.

Overall, this project simulates a simple vehicle rental system where customers can rent different types of vehicles for a specified duration. The code showcases concepts like inheritance, polymorphism, encapsulation, and error handling.

### Main.java
In this code, you're creating an instance of the Service class, generating vehicles and customers, and then renting a vehicle using the rentVehicle method. Please make sure to replace the debugging values for customerId and vehicleId with actual values from your generated customers and vehicles.

### Car.java
In this code, you can implement the Car class inherits from the Vehicle class and how the constructor and methods are used to implement specific behaviors of the Car class while inheriting attributes and behaviors from the parent class.

### Truck.java
In this code, the Truck class extends the Vehicle class and provides specific implementations for the rent and returnVehicle methods. The rent method includes additional checks for the minimum rental days specific to trucks. If the minimum rental days requirement is not met, an error message is displayed.

### Van.java
In this code, the Van class extends the Vehicle class and provides a specific implementation for the returnVehicle method. The returnVehicle method is used to return a rented van and reset its status.

### Service.java
In this code, the Service class is responsible for managing the rental process. It generates sample vehicles and customers, rents vehicles to customers, and returns rented vehicles. The helper methods getVehicle and getCustomer are used to retrieve vehicle and customer instances based on their IDs.

### Vehicle.java
This code represents an abstract class Vehicle that lays the foundation for various types of vehicles within a rental system. It encapsulates common properties and behaviors related to vehicle rental, while allowing subclasses like Car, Truck, and Van to provide specific implementations for returning the vehicle.

### VehicleType.java
The VehicleType enum defines different vehicle types with associated minimum license years and error messages. This information can be used to validate whether a customer is eligible to rent a particular type of vehicle.

### Customer.java
The Customer class represents a customer who can rent vehicles. It has properties for the customer's unique ID, name, surname, and year of driving license issuance. Getter and setter methods are provided for each property to allow accessing and modifying the customer's information. The toString method is overridden to provide a custom string representation of the customer object.

### DomainConstants.java
The DomainConstants class holds domain-specific constants that are used throughout the application. In this case, it defines a constant MINIMUM_TRUCK_RENT_DAY_COUNT that specifies the minimum number of days a truck can be rented for. This constant can be accessed and used by other classes in the application.