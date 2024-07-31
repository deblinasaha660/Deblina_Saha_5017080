package Sorting_Customar_Order;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Order> orders = new ArrayList<>();
        orders.add(new Order(1, "Ankita", 150.0));
        orders.add(new Order(2, "Delina", 99.99));
        orders.add(new Order(3, "Sourav", 199.99));
        orders.add(new Order(4, "Rahul", 120.50));

        System.out.println("Original orders:");
        printOrders(orders);

        // Bubble Sort
        List<Order> bubbleSortedOrders = new ArrayList<>(orders);
        OrderSorter.bubbleSort(bubbleSortedOrders);
        System.out.println("\nOrders after Bubble Sort:");
        printOrders(bubbleSortedOrders);

        // Quick Sort
        List<Order> quickSortedOrders = new ArrayList<>(orders);
        OrderSorter.quickSort(quickSortedOrders, 0, quickSortedOrders.size() - 1);
        System.out.println("\nOrders after Quick Sort:");
        printOrders(quickSortedOrders);
    }

    private static void printOrders(List<Order> orders) {
        for (Order order : orders) {
            System.out.println(order);
        }
    }
}