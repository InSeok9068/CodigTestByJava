package Q7_04_Parking_Lot;


import 코딩인터뷰완전분석.CtCILibrary.CtCILibrary.AssortedMethods;

public class Question {

    /**
     * @param args
     */
    public static void main(String[] args) {
        Q7_04_Parking_Lot.ParkingLot lot = new Q7_04_Parking_Lot.ParkingLot();

        Q7_04_Parking_Lot.Vehicle v = null;
        while (v == null || lot.parkVehicle(v)) {
            lot.print();
            int r = AssortedMethods.randomIntInRange(0, 10);
            if (r < 2) {
                v = new Q7_04_Parking_Lot.Bus();
            } else if (r < 4) {
                v = new Q7_04_Parking_Lot.Motorcycle();
            } else {
                v = new Q7_04_Parking_Lot.Car();
            }
            System.out.print("\nParking a ");
            v.print();
            System.out.println();
        }
        System.out.println("Parking Failed. Final state: ");
        lot.print();
    }

}
