public class Fleet {
    public static void main(String[] args) {

        Trucks B101 = new Trucks();
        B101.truckUnit = "B101";
        B101.driverName = "Igor";
        B101.driverPhoneNumber = "1232";
        B101.plateNumber = "N1213";
        B101.truckSize = 24.5;
        B101.payLoadLbs = 7600;
        B101.palletsFit = 12;

        Trucks B102 = new Trucks();
        B102.truckUnit = "B102";
        B102.driverName = "Sergey";
        B102.driverPhoneNumber = "9658";
        B102.plateNumber = "Q5648";
        B102.truckSize = 21.5;
        B102.payLoadLbs = 84000;
        B102.palletsFit = 8;

        Trucks B103 = new Trucks();
        B103.truckUnit = "A103";
        B103.driverName = "Stas";
        B103.driverPhoneNumber = "3252";
        B103.plateNumber = "C9652";
        B103.truckSize = 26;
        B103.payLoadLbs = 8000;
        B103.palletsFit = 14;

        Trucks B104 = new Trucks();
        B104.truckUnit = "A104";
        B104.driverName = "Stefan";
        B104.driverPhoneNumber = "9688";
        B104.plateNumber = "W8491";
        B104.truckSize = 24;
        B104.payLoadLbs = 7800;
        B104.palletsFit = 12;

        Trucks B105 = new Trucks();
        B105.truckUnit = "B105";
        B105.driverName = "Craig";
        B105.driverPhoneNumber = "3476";
        B105.plateNumber = "LO5689";
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

    }
}