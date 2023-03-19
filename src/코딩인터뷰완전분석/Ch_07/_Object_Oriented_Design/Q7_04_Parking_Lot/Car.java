package Q7_04_Parking_Lot;

public class Car extends Q7_04_Parking_Lot.Vehicle {
    public Car() {
        spotsNeeded = 1;
        size = Q7_04_Parking_Lot.VehicleSize.Compact;
    }

    public boolean canFitInSpot(Q7_04_Parking_Lot.ParkingSpot spot) {
        return spot.getSize() == Q7_04_Parking_Lot.VehicleSize.Large || spot.getSize() == Q7_04_Parking_Lot.VehicleSize.Compact;
    }

    public void print() {
        System.out.print("C");
    }
}
