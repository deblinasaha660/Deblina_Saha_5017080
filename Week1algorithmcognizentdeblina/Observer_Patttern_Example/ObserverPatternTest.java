package ObserverPatternExample;

public class ObserverPatternTest {
    public static void main(String[] args) {
        StockMarket stockMarket = new StockMarket();

        MobileApp mobileApp1 = new MobileApp("Investor A");
        MobileApp mobileApp2 = new MobileApp("Investor B");
        WebApp webApp = new WebApp("Stock Analyst");

        stockMarket.registerObserver(mobileApp1);
        stockMarket.registerObserver(mobileApp2);
        stockMarket.registerObserver(webApp);

        System.out.println("Stock price changed to $100.00");
        stockMarket.setStockPrice(100.00);

        System.out.println("\nDeregistering Investor B's mobile app");
        stockMarket.deregisterObserver(mobileApp2);

        System.out.println("\nStock price changed to $110.50");
        stockMarket.setStockPrice(110.50);
    }
}
