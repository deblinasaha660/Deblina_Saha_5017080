package Financial_Forcasting;

public class FutureValueCalculator {
    public static double calculateFutureValue(double pValue, double gRate, int y) {
        if (y == 0) {
            return pValue;
        }

        return (1 + gRate) * calculateFutureValue(pValue, gRate, y - 1);
    }

    public static double calculateFutureValueTail(double presentValue, double growthRate, int years, double accumulated) {
        if (years == 0) {
            return accumulated;
        }
        return calculateFutureValueTail(presentValue, growthRate, years - 1, accumulated * (1 + growthRate));
    }

    public static double calculateFutureValueIterative(double presentValue, double growthRate, int years) {
        double futureValue = presentValue;
        for (int i = 0; i < years; i++) {
            futureValue *= (1 + growthRate);
        }
        return futureValue;
    }

    public static double calculateFutureValueFormula(double presentValue, double growthRate, int years) {
        return presentValue * Math.pow(1 + growthRate, years);
    }
}