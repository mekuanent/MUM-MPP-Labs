import java.util.*;

public class B{

    public static void main(String[] str){

        ProductTitleComparator comparator = new ProductTitleComparator();

        List<Product> products = prepareList();

        products.sort(comparator);

        products.forEach(System.out::println);

    }

    private static List<Product> prepareList(){
        List<Product> products = new ArrayList<>();
        products.add(new Product("A", 7.54, 1));
        products.add(new Product("B", 3.29, 1));
        products.add(new Product("C", 5.64, 1));
        products.add(new Product("D", 9.23, 2));
        products.add(new Product("E", 1.35, 2));
        products.add(new Product("F", 2.63, 2));

        return products;
    }

}