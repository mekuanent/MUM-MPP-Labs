package exercise7;

import java.util.function.Consumer;
import java.util.stream.Stream;

/**
 * Created by Mekuanent Kassaye on 2019-03-13.
 */
public class Prob2 {

    public static void main(String[] args) {

        //I
        Stream.generate(Math::random).limit(10).forEach(System.out::println);

        //II
        Stream.generate(() -> Math.random()).limit(10).forEach(x -> System.out.println(x));

        //III
        MyRandomPrinter myRandomPrinter = new MyRandomPrinter();
        Stream.generate(() -> Math.random()).limit(10).forEach(myRandomPrinter);

    }

    public static class MyRandomPrinter implements Consumer<Double>{

        @Override
        public void accept(Double aDouble) {
            System.out.println(aDouble);
        }
    }

}
