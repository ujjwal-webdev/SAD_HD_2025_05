package SOLID;

import java.util.HashMap;
import java.util.Map;

public class OCP_01 {

    public interface DiscountStrategy {
        double calculateDiscount(double amount);
    }

    public static class RegularDiscount implements DiscountStrategy {
        @Override
        public double calculateDiscount(double amount) {
            return amount * 0.1;
        }
    }

    public static class PremiumDiscount implements DiscountStrategy {
        @Override
        public double calculateDiscount(double amount) {
            return amount * 0.2;
        }
    }

    public static class VIPDiscount implements DiscountStrategy {
        @Override
        public double calculateDiscount(double amount) {
            return amount * 0.3;
        }
    }

    public static class DiscountCalculator {
        private Map<String, DiscountStrategy> strategies = new HashMap<>();

        public void registerStrategy(String customerType, DiscountStrategy strategy) {
            strategies.put(customerType, strategy);
        }

        public double calculateDiscount(String customerType, double amount) {
            DiscountStrategy strategy = strategies.get(customerType);
            if (strategy != null) {
                return strategy.calculateDiscount(amount);
            }
            return 0.0;
        }
    }

    public static void main(String[] args) {
        DiscountCalculator calculator = new DiscountCalculator();

        // Register strategies
        calculator.registerStrategy("Regular", new RegularDiscount());
        calculator.registerStrategy("Premium", new PremiumDiscount());
        calculator.registerStrategy("VIP", new VIPDiscount());

        // Test
        System.out.println("Regular Discount: " + calculator.calculateDiscount("Regular", 100.0));
        System.out.println("Premium Discount: " + calculator.calculateDiscount("Premium", 100.0));
        System.out.println("VIP Discount: " + calculator.calculateDiscount("VIP", 100.0));
        System.out.println("Unknown Discount: " + calculator.calculateDiscount("Student", 100.0));
    }
}
