public class FleetManager {
    public static void main(String[] args) {

        Truck B101 = new Truck();
        B101.truckUnit = "B101";
        B101.truckSize = 24.5;
        B101.payLoadLbs = 7600;
        B101.palletsFit = 12;

        Truck B102 = new Truck();
        B102.truckUnit = "B102";
        B102.truckSize = 21.5;
        B102.payLoadLbs = 84000;
        B102.palletsFit = 8;

        Truck B103 = new Truck();
        B103.truckUnit = "A103";
        B103.truckSize = 26;
        B103.payLoadLbs = 8000;
        B103.palletsFit = 14;

        Truck B104 = new Truck();
        B104.truckUnit = "A104";
        B104.truckSize = 24;
        B104.payLoadLbs = 7800;
        B104.palletsFit = 12;

        Truck B105 = new Truck();
        B105.truckUnit = "B105";
        B105.truckSize = 22.8;
        B105.payLoadLbs = 8200;
        B105.palletsFit = 10;

        B101.displayTruckInfo();
        System.out.println("\n  ");

        B102.displayTruckInfo();
        System.out.println("\n  ");

        B103.displayTruckInfo();
        System.out.println("\n  ");

        B104.displayTruckInfo();
        System.out.println("\n  ");

        B105.displayTruckInfo();
        System.out.println("\n  ");

        Freight m00001 = new Freight();
        m00001.freightLength = 14.5;
        m00001.grossWeight = 4500;
        m00001.palletsCount = 6;

        double grossWeightM00001 = m00001.getGrossWeight();

        B101.isFreightFitToTheTruck((int) grossWeightM00001);
        B102.isFreightFitToTheTruck((int) grossWeightM00001);
        B103.isFreightFitToTheTruck((int) grossWeightM00001);
        B104.isFreightFitToTheTruck((int) grossWeightM00001);
        B105.isFreightFitToTheTruck((int) grossWeightM00001);

        Truck[] trucks = new Truck [5];
        trucks[0] = B101;
        trucks[1] = B102;
        trucks[2] = B103;
        trucks[3] = B104;
        trucks[4] = B105;

        for (Truck truck : trucks){
            boolean loadedStatus = truck.loadedStatus;
            if (loadedStatus){
                System.out.println("Good to go " + "\n" + truck );
            }
        }
    }
}