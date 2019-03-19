package Lab9;

import java.util.IntSummaryStatistics;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Created by Mekuanent Kassaye on 2019-03-14.
 */
public class Prob2 {

    public static void main(String[] args) {

        IntSummaryStatistics stat = Stream.of(15,3,65,23,46,11,76,23,74).collect(Collectors.summarizingInt(x -> x));

        System.out.println("Min: " + stat.getMin() + " Max: " + stat.getMax());

    }


}
