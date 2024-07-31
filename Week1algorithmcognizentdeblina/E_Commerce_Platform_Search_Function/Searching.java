
package E_Commerce_Platform_Search_Function;
import java.util.List;

public class Searching {

    public static Product linearSearch(List<Product> products, String targetName) {
        for (Product product : products) {
            if (product.getProductName().equals(targetName)) {
                return product;
            }
        }
        return null;
    }

    public static Product binarySearch(List<Product> products, String targetName) {
        int left = 0;
        int right = products.size() - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;
            int comparison = products.get(mid).getProductName().compareTo(targetName);

            if (comparison == 0) {
                return products.get(mid);
            } else if (comparison < 0) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return null;
    }
}