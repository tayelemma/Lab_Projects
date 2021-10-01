package lab_4;
import java.text.DecimalFormat;
import java.util.Scanner;

public class CoffeeBag {
    final static double PRICE_PER_POUND = 5.99;
    final static double TAX_RATE = 7.25;

    public static double totalPrice(int bagPound, int bagNum) {
        double price;
        double totalPriceWithTax;
        price = bagPound * bagNum * PRICE_PER_POUND;
        totalPriceWithTax = price + (price * (TAX_RATE/100));
        return totalPriceWithTax;
    }

    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);
        System.out.println("Please enter weight of a bag of coffee in pounds:");
        int bagPound = keyboard.nextInt();

        System.out.println("Please enter the number of bag sold ");
        int bagNum = keyboard.nextInt();

        CoffeeBag coffee = new CoffeeBag();
        double totalPrice = CoffeeBag.totalPrice(bagPound, bagNum);

        DecimalFormat df = new DecimalFormat("0.00");

        System.out.println("Number of bags sold: " + bagNum);
        System.out.println("     Weight per bag: " + bagPound + " lb");
        System.out.println("    Price per pound: $" + PRICE_PER_POUND);
        System.out.println("          Sales tax: " + TAX_RATE + "%");
        System.out.println();
        System.out.println("        Total price: $" + df.format(totalPrice));
    }

}
