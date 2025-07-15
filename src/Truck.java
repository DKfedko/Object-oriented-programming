public class Truck {

    public String truckUnit;
    public double truckSize;
    public int payLoadLbs;
    public boolean loadedStatus;
    public int palletsFit;

    public void displayTruckInfo() {
        System.out.println("Truck: " + truckUnit + ("\n") +
                "truck size Ft: " + truckSize + ("\n") +
                "truck payload LBS: " + payLoadLbs + ("\n") +
                "loaded: " + loadedStatus);
    }
    public boolean isFreightFitToTheTruck(int weightLBS) {
        if (weightLBS <= payLoadLbs) {
            return loadedStatus = true;
        } else {
            System.out.println("");
            return loadedStatus = false;
        }
    }
    
    public String getTruckUnit() {
        return truckUnit;
    }
    public double getTruckSize(){
        return truckSize;
    }
    public int getPayLoadLbs(){
        return payLoadLbs;
    }
    public boolean getLoadedStatus(){
        return loadedStatus;
    }
    public int getPalletsFit(){
        return  palletsFit;
    }

    @Override
    public String toString() {
        return "Trucks{" +
                "truckUnit='" + truckUnit + '\'' +
                ", truckSize=" + truckSize +
                ", payLoadLbs=" + payLoadLbs +
                ", loadedStatus=" + loadedStatus +
                ", palletsFit=" + palletsFit +
                '}';
    }
}

