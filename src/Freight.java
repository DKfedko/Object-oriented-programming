public class Freight {

    private double grossWeight;
    private int palletsCount;
    private double freightLength;

public void printFreightInfo(){
    System.out.println("Shipment info " + ("\n") +
            "weight: " + grossWeight+
            " pallets: " + + palletsCount +
            " length: " + freightLength);

}

    public double getGrossWeight(){
        return grossWeight;
    }
    public int getPalletsCount(){
        return palletsCount;
    }
    public double getFreightLength(){
        return freightLength;
    }
    public void setGrossWeight(double grossWeight) {
        this.grossWeight = grossWeight;
    }
    public void setPalletsCount(int palletsCount) {
        this.palletsCount = palletsCount;
    }
    public void setFreightLength(double freightLength) {
        this.freightLength = freightLength;
    }
}