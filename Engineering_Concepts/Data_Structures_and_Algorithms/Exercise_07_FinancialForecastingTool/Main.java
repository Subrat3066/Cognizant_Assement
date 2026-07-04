package Exercise_03_FinancialForecastingTool;

public class Main {

    public static void main(String[] args) {

        double initialValue = 10000.00;
        double growthRate = 0.10;
        int years = 5;

        double futureValue = FinancialForecast.calculateFutureValue(initialValue, growthRate, years);

        System.out.println("Initial Value: " + initialValue);

        System.out.println("Growth Rate: " + (growthRate * 100) + "%");

        System.out.println("Number of Years: " + years);

        System.out.printf("Predicted Future Value: %.2f%n", futureValue);
    }
}
