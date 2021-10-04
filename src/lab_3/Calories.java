package lab_3;

import java.util.Scanner;

public class Calories {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter body weight in pounds please");

        double bodyWeight = input.nextDouble();
        double calories = bodyWeight * 19;

        System.out.println( calories + " calories per day");
    }
}
