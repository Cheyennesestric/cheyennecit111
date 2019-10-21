package week7;

import java.util.Scanner;

/**
 *
 * @author Cheyenne Sestric
 */
public class PurchaseCalculator {

    public static void main(String[] args) {
        Scanner keyboardReader = new Scanner(System.in);
        int response;
        double discountResponse;
        double priceResponse;
        System.out.println("Enter your budget and press enter (no $): ");
        response = keyboardReader.nextInt();
        System.out.println("Enter price of item (no $) : " );
        priceResponse = keyboardReader.nextDouble();
        System.out.println("Enter the percent discount and press enter"
                + "(no %): ");
        discountResponse = keyboardReader.nextDouble();
        displayPriceWithTax(priceResponse);
        discountResponse = keyboardReader.nextDouble();
        System.out.println("Discount rate: " + discountResponse);
        computePriceAfterDiscount(100.00, 0.2);
        displayPurchaseableNumber(100.0, response);

    }

    public static void displayPriceWithTax(double price) {
        final double TAX_RATE = 0.075;
        double totalPrice = price * (1 + TAX_RATE);
        System.out.println("Total price with tax: $" + totalPrice);
    }

    public static void computePriceAfterDiscount(double price, double discount) {

        double finalPrice = price - (price * discount);
        System.out.println("Price after discount: $" + finalPrice);

    }

    public static void displayPurchaseableNumber(double price, double limit) {
        int numPurchaseable = (int) Math.floor(limit / price);
        System.out.println("Maximum amount of items within budget: "
                + numPurchaseable);
    }
}
