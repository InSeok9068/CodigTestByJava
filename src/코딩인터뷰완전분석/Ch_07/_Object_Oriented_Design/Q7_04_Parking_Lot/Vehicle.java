package Q7_04_Parking_Lot;

import java.util.ArrayList;

public abstract class Vehicle {
    protected ArrayList<Q7_04_Parking_Lot.ParkingSpot> parkingSpots = new ArrayList<Q7_04_Parking_Lot.ParkingSpot>();
    protected String licensePlate;
    protected int spotsNeeded;
    protected Q7_04_Parking_Lot.VehicleSize size;

    public int getSpotsNeeded() {
        return spotsNeeded;
    }

    public Q7_04_Parking_Lot.VehicleSize getSize() {
        return size;
    }

    /* Park vehicle in this spot (among others, potentially) */
    public void parkInSpot(Q7_04_Parking_Lot.ParkingSpot spot) {
        parkingSpots.add(spot);
    }

    /* Remove car from spot, and notify spot that it's gone */
    public void clearSpots() {
        for (int i = 0; i < parkingSpots.size(); i++) {
            parkingSpots.get(i).removeVehicle();
        }
        parkingSpots.clear();
    }

    public abstract boolean canFitInSpot(Q7_04_Parking_Lot.ParkingSpot spot);

    public abstract void print();
}
