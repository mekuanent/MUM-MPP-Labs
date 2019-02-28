
public class Trailer extends Property{
    
    final static double RATE_OF_RENT = 500.0; 

    public Trailer(){
        super(Trailer.RATE_OF_RENT);
    }

    public double computeRent(){
        return Trailer.RATE_OF_RENT;
    }

}