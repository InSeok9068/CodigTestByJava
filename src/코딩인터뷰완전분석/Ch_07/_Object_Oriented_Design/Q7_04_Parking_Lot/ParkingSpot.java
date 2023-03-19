package Q7_04_Parking_Lot;

public class ParkingSpot {
    private Q7_04_Parking_Lot.Vehicle vehicle;
    private final Q7_04_Parking_Lot.VehicleSize spotSize;
    private final int row;
    private final int spotNumber;
    private final Level level;

    public ParkingSpot(Level lvl, int r, int n, Q7_04_Parking_Lot.VehicleSize sz) {
        level = lvl;
        row = r;
        spotNumber = n;
        spotSize = sz;
    }

    public boolean isAvailable() {
        return vehicle == null;
    }

    /* Checks if the spot is big enough for the vehicle (and is available). This compares
     * the SIZE only. It does not check if it has enough spots. */
    public boolean canFitVehicle(Q7_04_Parking_Lot.Vehicle vehicle) {
        return isAvailable() && vehicle.canFitInSpot(this);
    }

    /* Park vehicle in this spot. */
    public boolean park(Q7_04_Parking_Lot.Vehicle v) {
        if (!canFitVehicle(v)) {
            return false;
        }
        vehicle = v;
        vehicle.parkInSpot(this);
        return true;
    }

    public int getRow() {
        return row;
    }

    public int getSpotNumber() {
        return spotNumber;
    }

    public Q7_04_Parking_Lot.VehicleSize getSize() {
        return spotSize;
    }

    /* Remove vehicle from spot, and notify level that a new spot is available */
    public void removeVehicle() {
        level.spotFreed();
        vehicle = null;
    }

    public void print() {
        if (vehicle == null) {
            if (spotSize == Q7_04_Parking_Lot.VehicleSize.Compact) {
                System.out.print("c");
            } else if (spotSize == Q7_04_Parking_Lot.VehicleSize.Large) {
                System.out.print("l");
            } else if (spotSize == Q7_04_Parking_Lot.VehicleSize.Motorcycle) {
                System.out.print("m");
            }
        } else {
            vehicle.print();
        }
    }
}
