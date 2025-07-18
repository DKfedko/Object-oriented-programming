public class FleetManager {

    public static void main(String[] args) {

        Truck [] trucks  = {
                new Truck("b055", 22.5,8500, 12),
                new Truck("b055", 22.5,8500, 12)
        };

        Truck b103 = new Truck("b101",18.5, 7800, 8);
        Truck b104 = new Truck("b102",20.5, 8400, 10);

        System.out.println(b103);

        b104.displayTruckInfo ();
            System.out.println("\n  ");


        Freight m00001 = new Freight();
        m00001.setFreightLength(14.5);
        m00001.setGrossWeight(6400);
        m00001.setPalletsCount(8);

        Freight m00002 = new Freight();
        m00002.setFreightLength(18);
        m00002.setGrossWeight(4500);
        m00002.setPalletsCount(5);

        Freight m00003 = new Freight();
        m00003.setFreightLength(12);
        m00003.setGrossWeight(6841);
        m00003.setPalletsCount(6);

        m00001.printFreightInfo();
        m00002.printFreightInfo();
        m00003.printFreightInfo();
    }
}