import java.util.*;

public class D{

    static class MyComparator implements Comparator<Product>{

        boolean comparingWithPrice;

        public void setComparingWithPrice(boolean value){
            this.comparingWithPrice = value;
        }

            

        @Override
        public int compare(Product o1, Product o2) {
            if(comparingWithPrice)
                return Double.compare(o1.getPrice(), o2.getPrice());
            else return o1.getTitle().compareTo(o2.getTitle());
        }

    }

    public static void main(String[] str){

        List<Product> products = prepareList();

        products.sort((p1, p2) -> {
            int titleComp = p1.getTitle().compareTo(p2.getTitle());
            if(titleComp != 0) return titleComp;
            
            return Integer.compare(p1.getModel(), p2.getModel());
        });

        products.forEach(System.out::println);

    }

    private static List<Product> prepareList(){
        List<Product> products = new ArrayList<>();
        products.add(new Product("A", 7.54, 1));
        products.add(new Product("B", 3.29, 1));
        products.add(new Product("C", 5.64, 2));
        products.add(new Product("C", 9.23, 1));
        products.add(new Product("E", 1.35, 2));
        products.add(new Product("F", 2.63, 2));

        return products;
    }

}