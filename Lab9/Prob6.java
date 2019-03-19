package Lab9;

import java.util.*;

/**
 * Created by Mekuanent Kassaye on 2019-03-18.
 */
public class Prob6 {

    public Set<String> union(List<Set<String>> sets){
        return sets.stream().reduce(new HashSet<>(), (x, y) -> {
            HashSet<String> set = new HashSet<>();
            set.addAll(x);
            set.addAll(y);
            return set;});
    }

    public static void main(String[] args) {
        List<Set<String>> list = new ArrayList<>();

        HashSet<String> s1 = new HashSet<>();
        s1.add("A");
        s1.add("B");

        HashSet<String> s2 = new HashSet<>();
        s2.add("D");

        HashSet<String> s3 = new HashSet<>();
        s3.add("1");
        s3.add("3");
        s3.add("5");

        list.add(s1);
        list.add(s2);
        list.add(s3);

        System.out.println(new Prob6().union(list));
    }

}
