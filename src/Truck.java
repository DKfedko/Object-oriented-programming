public class Truck {

    private String truckUnit;
    private final double truckSize;
    private final double payLoadLbs;
    private int palletsFit;

    public Truck(String truckUnit, double truckSize, int payLoadLbs, int palletsFit) {
        this.truckUnit = truckUnit;
        this.payLoadLbs = payLoadLbs;
        this.truckSize = truckSize;
        this.palletsFit = palletsFit;
    }

    public boolean ifTruckCanGo(Freight  freight) {
        return freight.getGrossWeight() <= this.palletsFit;
    }

    //public int

    public String getTruckUnit() {
        return truckUnit;
    }
    public double getTruckSize() {
        return truckSize;
    }
    public double getPayLoadLbs() {
        return payLoadLbs;
    }
    public int getPalletsFit() {
        return palletsFit;
    }
    @Override
    public String toString() {
        return "Trucks{" +
                "truckUnit='" + truckUnit + '\'' +
                ", truckSize=" + truckSize +
                ", payLoadLbs=" + payLoadLbs +
                ", palletsFit=" + palletsFit +
                '}';
    }
}

