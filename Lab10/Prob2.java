package Lab10;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

/**
 * Created by Mekuanent Kassaye on 2019-03-18.
 */
public class Prob2 {

    public static <T extends Comparable<? super T>> T secondSmallest(List<T> list){
        return list.stream().sorted(Comparator.reverseOrder()).skip(1).findFirst().orElse(null);
    }

    public static void main(String[] args) {
        System.out.println(secondSmallest(Arrays.asList(1,2,6,7834,435,23,12,53,556,84,25,76356,8653)));
        System.out.println(secondSmallest(Arrays.asList("jack", "john", "micky", "abel", "somet", "chung")));
        System.out.println(secondSmallest(
                Arrays.asList(LocalDate.of(2014,4,1),
                        LocalDate.of(2019, 2,2),
                        LocalDate.of(2018, 4,5))));
    }

}
