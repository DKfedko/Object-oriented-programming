public class Freight {
    private String loadNumber;
    private double grossWeight;
    private int palletsCount;
    private double freightLength;

        public Freight (String loadNumber, double grossWeight, int palletsCount, double freightLength){
            this.loadNumber = loadNumber;
            this.grossWeight = grossWeight;
            this.palletsCount = palletsCount;
            this.freightLength = freightLength;
        }

    public String getLoadNumber() {
        return loadNumber;
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
    @Override
    public String toString() {
        return "Freight{" +
                "loadNumber='" + loadNumber + '\'' +
                ", grossWeight=" + grossWeight +
                ", palletsCount=" + palletsCount +
                ", freightLength=" + freightLength +
                '}';
    }
}