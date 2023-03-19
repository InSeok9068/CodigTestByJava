package 코딩인터뷰완전분석.Ch_07._Object_Oriented_Design.Q7_04_Parking_Lot;

public class Bus extends Vehicle {
    public Bus() {
        spotsNeeded = 5;
        size = VehicleSize.Large;
    }

    public boolean canFitInSpot(ParkingSpot spot) {
        return spot.getSize() == VehicleSize.Large;
    }

    public void print() {
        System.out.print("B");
    }
}
