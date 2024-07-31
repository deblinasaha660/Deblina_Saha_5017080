package E_Commerce_Platform_Search_Function;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ECommerceSearch {
    public static void main(String[] args) {
        List<Product> products = new ArrayList<>();
        products.add(new Product(1, "Tv", "Electronics"));
        products.add(new Product(2, "Sofa", "Clothing"));
        products.add(new Product(3, "Book", "Literature"));
        products.add(new Product(4, "Phone", "Electronics"));

        // Linear search
        Product foundLinear = Searching.linearSearch(products, "key");
        System.out.println("Linear Search Result: " + (foundLinear != null ? foundLinear.getProductName() : "Not found"));

        Collections.sort(products, (a, b) -> a.getProductName().compareTo(b.getProductName()));

        // Binary search
        Product foundBinary = Searching.binarySearch(products, "Book");
        System.out.println("Binary Search Result: " + (foundBinary != null ? foundBinary.getProductName() : "Not found"));
    }
}
