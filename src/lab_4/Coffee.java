package lab_4;

import java.util.Scanner;

public class Coffee {

    final static double PRICE_PER_POUND = 5.99;
    final static double SALES_TAX = 7.25;

    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the weight in pounds:");
        int weightBag = input.nextInt();

        System.out.println("Please enter the amount sold ");
        input = new Scanner(System.in);
        int numberOfBags = input.nextInt();

        DecimalFormat df = new DecimalFormat("0.00");

        double totalPrice = Coffee.totalPrice(weightBag, numberOfBags);

        System.out.println("Bags sold= " + numberOfBags);
        System.out.println("Weight per bag= " + weightBag + " lb");
        System.out.println("Price per pound= $" + PRICE_PER_POUND);
        System.out.println("Tax= " + SALES_TAX + "%");
        System.out.println("Total price= " + df.format(totalPrice));
    }

    public static double totalPrice(int weightBag, int numberOfBags) {
        double finalPrice = weightBag * numberOfBags * PRICE_PER_POUND;
        return (finalPrice + (finalPrice * SALES_TAX / 100));
    }
}