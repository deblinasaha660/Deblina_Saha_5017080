package Sorting_Customar_Order;

    public class Order implements Comparable<Order> {
        private int oId;
        private String cName;
        private double tPrice;

        public Order(int orderId, String customerName, double totalPrice) {
            this.oId = orderId;
            this.cName = customerName;
            this.tPrice = totalPrice;
        }

        public double getTotalPrice() {
            return tPrice;
        }

        @Override
        public int compareTo(Order other) {
            return Double.compare(this.tPrice, other.tPrice);
        }

        @Override
        public String toString() {
            return "Order{" +
                    "orderId=" + oId +
                    ", customerName='" + cName + '\'' +
                    ", totalPrice=" + tPrice +
                    '}';
        }
    }

