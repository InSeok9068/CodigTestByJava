package Q7_04_Parking_Lot;

public class Bus extends Q7_04_Parking_Lot.Vehicle {
    public Bus() {
        spotsNeeded = 5;
        size = Q7_04_Parking_Lot.VehicleSize.Large;
    }

    public boolean canFitInSpot(Q7_04_Parking_Lot.ParkingSpot spot) {
        return spot.getSize() == Q7_04_Parking_Lot.VehicleSize.Large;
    }

    public void print() {
        System.out.print("B");
    }
}
