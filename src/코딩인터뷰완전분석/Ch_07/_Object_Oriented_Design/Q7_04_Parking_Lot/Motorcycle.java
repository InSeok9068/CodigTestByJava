package Q7_04_Parking_Lot;

public class Motorcycle extends Q7_04_Parking_Lot.Vehicle {
    public Motorcycle() {
        spotsNeeded = 1;
        size = Q7_04_Parking_Lot.VehicleSize.Motorcycle;
    }

    public boolean canFitInSpot(Q7_04_Parking_Lot.ParkingSpot spot) {
        return true;
    }

    public void print() {
        System.out.print("M");
    }
}
