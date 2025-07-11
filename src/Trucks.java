public class Trucks {

    public String truckUnit;
    public String driverName;
    public String driverPhoneNumber;
    public String plateNumber;
    public double truckSize;
    public int payLoadLbs;
    public boolean loadedStatus;
    public int palletsFit;

    public void displayTruckInfo() {
        System.out.println ("Truck: " + truckUnit + ("\n") +
                "Driver's name is: " + driverName + ("\n") + "plate#: " + plateNumber + ("\n") +
                "truck size Ft: " + truckSize + ("\n") +
                "truck payload LBS: " + payLoadLbs + ("\n") +
                "loaded: " + loadedStatus);
    }

    public boolean isFreightFitToTheTruck (int weightLBS) {
        if (weightLBS <= payLoadLbs) {
            return loadedStatus = true;
        } else {
            return loadedStatus = false;
        }
    }
}
