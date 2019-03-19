package Lab9;

import java.util.Arrays;
import java.util.List;

/**
 * Created by Mekuanent Kassaye on 2019-03-15.
 */
public class Prob3 {

    public static void main(String[] args) {

        List<String> list = Arrays.asList("Apple", "Orange", "Banana", "Mango");
        Prob3 prob3 = new Prob3();
        System.out.println(prob3.countWords(list, 'a', 'k', 5));

    }


    public long countWords(List<String> words, char c, char d, int len){

        return words.stream()
                .filter(w -> w.contains(c + "") && !w.contains(d + "") && w.length() == len)
                .count();

    }

}
