import java.util.*;

public class C{
    static enum SortMethod {BYTITLE, BYPRICE};
    
    public void sort(List<Product> products, SortMethod method){
        class MyComparator implements Comparator<Product>{

            @Override
            public int compare(Product o1, Product o2) {
                if(method == SortMethod.BYPRICE) {
                    return Double.compare(o1.getPrice(), o2.getPrice());
                }
                else return o1.getTitle().compareTo(o2.getTitle());
            }
    
        }

        Collections.sort(products, new MyComparator());
    }

    public static void main(String[] str){

        List<Product> products = prepareList();
        C c = new C();

        //Comparing with Price
        System.out.println("\n----Sorting By Price");
        c.sort(products, C.SortMethod.BYPRICE);
        products.forEach(System.out::println);


        //Comparing with Title
        System.out.println("\n----Sorting By Title");
        c.sort(products, C.SortMethod.BYTITLE);
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