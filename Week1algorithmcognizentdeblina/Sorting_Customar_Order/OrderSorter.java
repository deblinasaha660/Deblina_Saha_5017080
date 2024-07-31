package Sorting_Customar_Order;
import java.util.List;

    public class OrderSorter {

        public static void bubbleSort(List<Order> orders) {
            int n = orders.size();
            for (int i = 0; i < n - 1; i++) {
                for (int j = 0; j < n - i - 1; j++) {
                    if (orders.get(j).getTotalPrice() > orders.get(j + 1).getTotalPrice()) {
                        // Swap orders[j] and orders[j+1]
                        Order temp = orders.get(j);
                        orders.set(j, orders.get(j + 1));
                        orders.set(j + 1, temp);
                    }
                }
            }
        }

        public static void quickSort(List<Order> orders, int low, int high) {
            if (low < high) {
                int pi = partition(orders, low, high);
                quickSort(orders, low, pi - 1);
                quickSort(orders, pi + 1, high);
            }
        }

        private static int partition(List<Order> orders, int low, int high) {
            double pivot = orders.get(high).getTotalPrice();
            int i = (low - 1);
            for (int j = low; j < high; j++) {
                if (orders.get(j).getTotalPrice() < pivot) {
                    i++;
                    Order temp = orders.get(i);
                    orders.set(i, orders.get(j));
                    orders.set(j, temp);
                }
            }
            Order temp = orders.get(i + 1);
            orders.set(i + 1, orders.get(high));
            orders.set(high, temp);
            return i + 1;
        }
    }

