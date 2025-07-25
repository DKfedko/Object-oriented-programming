public class FleetManager {

    public static void main(String[] args) {

        Truck[] trucks = {
                new Truck("b055", 22.5, 8500, 12),
                new Truck("b066", 22.5, 8500, 12),
                new Truck("b101", 18.5, 7800, 8),
                new Truck("b102", 20.5, 8400, 10),
        };

        Freight[] freights = {
                new Freight("m00001", 8150, 14, 18),
                new Freight("m00002", 6550, 6, 13),
                new Freight("m00003", 7865, 8, 12),
                new Freight("m00004", 6400, 14, 22),
        };

        for (Truck straightTrucks : trucks)
            System.out.println(straightTrucks);

        for (Freight loads : freights)
            System.out.println(loads);

        for (Truck truck : trucks) {
            for (Freight freight : freights) {
                if (truck.ifTruckCanGo(freight)) {
                    System.out.println("Freight " + freight.getLoadNumber() + " Good to go with the truck " + truck.getTruckUnit());
                } else {
                    System.out.println("Freight " + freight.getLoadNumber() + " NO GO, overweight " + truck.getTruckUnit());

                }
            }
        }
        for (Truck truck : trucks) {
            for (Freight load : freights) {
                if (truck.ifTruckCanGo(load)) {
                    System.out.println("Freight " + load.getLoadNumber() + " fits to truck " + truck.getTruckUnit());
                } else {
                    System.out.println("Freight " + load.getLoadNumber() + " won't fir to the truck " + truck.getTruckUnit());
                }
            }
        }
    }
}
