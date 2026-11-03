interface ParkingCharge {
    double calculateCharge();
    void displayParkingDetails();
}

class VehicleParking {
    String vehicleNumber;
    String vehicleType;
    int parkingHours;

    VehicleParking(String number, String type, int hours) {
        vehicleNumber = number;
        vehicleType = type;
        parkingHours = hours;
    }
}

class TwoWheeler extends VehicleParking implements ParkingCharge {

    TwoWheeler(String number, int hours) {
        super(number, "Two Wheeler", hours);
    }

    public double calculateCharge() {
        if (parkingHours <= 2)
            return parkingHours * 20;
        else
            return 2 * 20 + (parkingHours - 2) * 10;
    }

    public void displayParkingDetails() {
        System.out.println("Vehicle Number: " + vehicleNumber);
        System.out.println("Vehicle Type: " + vehicleType);
        System.out.println("Parking Hours: " + parkingHours);
        System.out.println("Parking Charge: " + calculateCharge());
    }
}

class FourWheeler extends VehicleParking implements ParkingCharge {

    FourWheeler(String number, int hours) {
        super(number, "Four Wheeler", hours);
    }

    public double calculateCharge() {
        if (parkingHours <= 2)
            return parkingHours * 50;
        else
            return 2 * 50 + (parkingHours - 2) * 30;
    }

    public void displayParkingDetails() {
        System.out.println("Vehicle Number: " + vehicleNumber);
        System.out.println("Vehicle Type: " + vehicleType);
        System.out.println("Parking Hours: " + parkingHours);
        System.out.println("Parking Charge: " + calculateCharge());
    }
}

public class ParkingDemo {
    public static void main(String[] args) {

        ParkingCharge p1 = new TwoWheeler("KA01AB1234", 3);
        ParkingCharge p2 = new FourWheeler("KA02CD5678", 4);

        System.out.println("Two Wheeler Details:");
        p1.displayParkingDetails();

        System.out.println("\nFour Wheeler Details:");
        p2.displayParkingDetails();
    }
}