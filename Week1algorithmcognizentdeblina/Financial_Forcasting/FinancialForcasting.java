package Financial_Forcasting;

public class FinancialForcasting {
    public static void main(String[] args) {
        double presentValue = 1000;
        double growthRate = 0.05;
        int years = 5;

        double futureValue = FutureValueCalculator.calculateFutureValue(presentValue, growthRate, years);
        System.out.printf("Future value after %d years (recursive): $%.2f%n", years, futureValue);

    }
}
