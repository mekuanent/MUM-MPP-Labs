public class Condo extends Property{

    private int numOfFloors = 0;
    final static double RATE_OF_RENT = 400;  

    public Condo(int numOfFloors){
        super(numOfFloors * RATE_OF_RENT);
        this.numOfFloors = numOfFloors;
    }

    /**
     * @return the numOfFloors
     */
    public int getNumOfFloors() {
        return numOfFloors;
    }

    /**
     * @param numOfFloors the numOfFloors to set
     */
    public void setNumOfFloors(int numOfFloors) {
        this.numOfFloors = numOfFloors;
    }

    public double computeRent(){
        double rent = this.numOfFloors * Condo.RATE_OF_RENT;
        super.setRent(rent);
        return rent;
    }

}