class Vehicle {
    private String brand;
    private double speed;

    public Vehicle(String brand, double speed) {
        this.brand = brand;
        this.speed = speed;
    }

    public void displayInfo() {
        System.out.println("Vehicle brand: " + brand + ", Speed: " + speed);
    }

    public String getBrand() {
        return brand;
    }

    public double getSpeed() {
        return speed;
    }
}

class Car extends Vehicle {
    private String seatType;

    public Car(String brand, double speed, String seatType) {
        super(brand, speed);
        this.seatType = seatType;
    }

    @Override
    public void displayInfo() {
        System.out.println("Car brand: " + getBrand() +
                ", Speed: " + getSpeed() +
                ", Seat type: " + seatType);
    }
}

class Bike extends Vehicle {
    private String type;

    public Bike(String brand, double speed, String type) {
        super(brand, speed);
        this.type = type;
    }

    @Override
    public void displayInfo() {
        System.out.println("Bike brand: " + getBrand() +
                ", Speed: " + getSpeed() +
                ", Type: " + type);
    }
}

public class CustomVehicle {
    public static void main(String[] args) {

        Vehicle[] vehicles = new Vehicle[2];

        vehicles[0] = new Car("Porsche", 250.5, "Sport Seats");
        vehicles[1] = new Bike("Yamaha", 180.2, "Racing");

        for (Vehicle v : vehicles) {
            v.displayInfo();  // Runtime Polymorphism
        }
    }
}
