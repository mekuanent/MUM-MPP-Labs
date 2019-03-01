public class Driver{

    public static void main(String... args){
        Hourly hourly = new Hourly(1, 50, 40);
        Salaried salaried = new Salaried(2, 4000);
        Commisioned commisioned = new Commisioned(3, 10, 1000);
        hourly.print();
        salaried.print();
        commisioned.print();
    }

}