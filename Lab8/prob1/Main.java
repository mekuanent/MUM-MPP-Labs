import java.util.List;
import java.util.function.BiFunction;
import java.util.ArrayList;

public class Main{

   public static void main(String[] args){


        BiFunction<Double, Double, List<Double>> function = (x,y) -> {
            List<Double> list = new ArrayList<>();
            list.add(Math.pow(x,y));
            list.add(x * y);
            return list;
        };

        function.apply(2.0, 3.0).forEach(System.out::println);

   }
}
