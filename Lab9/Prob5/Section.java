package Lab9.Prob5;

import java.util.Arrays;
import java.util.stream.Stream;

/**
 * Created by Mekuanent Kassaye on 2019-03-18.
 */
public class Section {

    public static Stream<String> streamSection(Stream<String> stream, int m, int n) {
        return stream.skip(m).limit(n - m + 1);
    }

    public static void main(String[] args) {

        System.out.println("\n--------1\n");
        streamSection(nextStream(), 2, 4).forEach(System.out::println);
        System.out.println("\n--------2\n");
        streamSection(nextStream(), 3, 3).forEach(System.out::println);
        System.out.println("\n--------3\n");
        streamSection(nextStream(), 0, 8).forEach(System.out::println);

    }

    //support method for the main method -- for testing
    private static Stream<String> nextStream() {
        return Arrays.asList("aaa", "bbb", "ccc", "ddd", "eee", "fff", "ggg", "hhh",
                "iii").stream();
    }

}
