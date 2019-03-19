package Lab9;

import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Created by Mekuanent Kassaye on 2019-03-14.
 */
public class Prob1 {

    public static void main(String[] args) {
        System.out.println(Stream.of("Bill", "Thomas", "Mary").collect(Collectors.joining(", ")));
    }

}
