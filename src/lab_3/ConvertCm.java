package lab_3;

import java.util.Scanner;

public class ConvertCm {
    public static void main(String[] args) {

        double inches;
        double inches2;
        int ft;

        Scanner input = new Scanner(System.in);
        System.out.println("Enter the cm to convert into feet inches ");
        double cm = input.nextDouble();

        inches = (1 * cm) / 2.54;
        ft = (int)inches /12;
        inches2 = inches % 12;
        System.out.println(ft + " feet and  " + inches2 + " inches" );

    }
}
