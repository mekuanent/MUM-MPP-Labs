
public class House extends Property{

    private double lotSize;
    final static double RATE_OF_RENT = 0.1;  

    public House(double lotSize){
        super(lotSize * RATE_OF_RENT);
        this.lotSize = lotSize;
    }

    /**
     * @return the lotSize
     */
    public double getLotSize() {
        return lotSize;
    }

    /**
     * @param lotSize the lotSize to set
     */
    public void setLotSize(double lotSize) {
        this.lotSize = lotSize;
    }

    public double computeRent(){
        double rent = this.lotSize * House.RATE_OF_RENT;
        super.setRent(rent);
        return rent;
    }

}