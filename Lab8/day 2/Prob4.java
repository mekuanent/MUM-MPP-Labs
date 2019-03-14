package exercise7;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Created by Mekuanent Kassaye on 2019-03-13.
 */
public class Prob4 {

    public static void main(String[] args) {
        String[] names = {"Alexis", "Tim", "Kyleen", "KRISTY"};

        Arrays.sort(names, String::compareTo);

        System.out.println(Arrays.asList(names));

    }

}
