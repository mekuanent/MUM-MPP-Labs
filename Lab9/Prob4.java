package Lab9;

import java.util.stream.Stream;

/**
 * Created by Mekuanent Kassaye on 2019-03-18.
 */
public class Prob4 {

    public static void printSquares(int num){
        Stream.iterate(1, x -> (int)Math.pow(Math.sqrt(x) + 1, 2))
                .limit(num)
                .forEach(System.out::println);
    }

    public static void main(String[] args) {
        printSquares(4);
    }

}
