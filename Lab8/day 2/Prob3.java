package exercise7;

import java.util.Arrays;
import java.util.List;

/**
 * Created by Mekuanent Kassaye on 2019-03-13.
 */
public class Prob3 {

    public static void main(String[] args) {
        List<String> fruits = Arrays.asList("Apple", "Banana","Orange","Cherries","blums");

        //a
        fruits.forEach(x -> System.out.println(x));

        //b
        fruits.forEach(System.out::println);

    }

}
