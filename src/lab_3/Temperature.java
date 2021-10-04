package lab_3;

import java.util.Scanner;

public class Temperature {
    public static void main(String[] args) {

        double celsius;
        double fahrenheit;

        Scanner input = new Scanner(System.in);
        System.out.println("Enter the temperature in degree Celsius");

        celsius = input.nextDouble();
        fahrenheit = 1.8 * celsius + 32;
        System.out.println(celsius + " Degree Celsius is equal to " + fahrenheit + " Degree Fahrenheit.");

    }
}
