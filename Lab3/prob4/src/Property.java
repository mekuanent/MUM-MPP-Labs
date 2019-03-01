public abstract class Property{

    private Address adress;
    private double rent;

    public Property(double rent){
        this.rent = rent;
    }

    /**
     * @return the adress
     */
    public Address getAdress() {
        return adress;
    }

    /**
     * @param adress the adress to set
     */
    public void setAdress(Address adress) {
        this.adress = adress;
    }

    /**
     * @return the rent
     */
    public double getRent() {
        return rent;
    }

    /**
     * @param rent the rent to set
     */
    public void setRent(double rent) {
        this.rent = rent;
    }

    abstract public double computeRent();

}