package Lab9.Prob8;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

import static java.util.Comparator.comparing;

public class PuttingIntoPractice{
    public static void main(String ...args){    
        Trader raoul = new Trader("Raoul", "Cambridge");
        Trader mario = new Trader("Mario","Milan");
        Trader alan = new Trader("Alan","Cambridge");
        Trader brian = new Trader("Brian","Cambridge");
		
		List<Transaction> transactions = Arrays.asList(
            new Transaction(brian, 2011, 300), 
            new Transaction(raoul, 2012, 1000),
            new Transaction(raoul, 2011, 400),
            new Transaction(mario, 2012, 710),	
            new Transaction(mario, 2012, 700),
            new Transaction(alan, 2012, 950)
        );	
        
        
        // Query 1: Find all transactions from year 2011 and sort them by value (small to high).
        transactions.stream()
                .filter(t -> t.getYear() == 2011)
                .sorted(Comparator.comparingInt(Transaction::getValue))
                .forEach(System.out::println);

        
        // Query 2: What are all the unique cities where the traders work?
        transactions.stream()
                .map(t -> t.getTrader().getCity())
                .distinct()
                .forEach(System.out::println);

        // Query 3: Find all traders from Cambridge and sort them by name.
        transactions.stream()
                .filter(t -> t.getTrader().getCity().equalsIgnoreCase("Cambridge"))
                .map(Transaction::getTrader)
                .sorted(Comparator.comparing(Trader::getName))
                .forEach(System.out::println);
   
        
        // Query 4: Return a string of all traders names sorted alphabetically.
        transactions.stream()
                .map(t -> t.getTrader().getName())
                .distinct()
                .sorted(Comparator.naturalOrder())
                .forEach(System.out::println);

        // Query 5: Are there any trader based in Milan?
        System.out.println(
                transactions.stream()
                .anyMatch(t -> t.getTrader().getCity().equals("Milan"))
        );
   
     // Query 6: Update all transactions so that the traders from Milan are set to Cambridge.
        transactions.stream()
                .filter(t -> t.getTrader().getCity().equals("Milan"))
                .forEach(t -> t.getTrader().setCity("Cambridge"));

        transactions.forEach(System.out::println);
        
        // Query 7: What's the highest value in all the transactions?

        transactions.stream()
                .map(Transaction::getValue)
                .max(Comparator.naturalOrder())
                .ifPresent(System.out::println);
    }
}
