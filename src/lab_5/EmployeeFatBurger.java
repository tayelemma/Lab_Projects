package lab_5;

import java.util.Scanner;

public class EmployeeFatBurger {
    static double HOURLY_WAGE = 7.25;
    public static void main(String[] args) {
        int workHour;
        double totalSale;
        double wage;
        double commisstion;

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter work hours");
        workHour = input.nextInt();

        System.out.println("Please enter the total sales");
        totalSale = input.nextDouble();


    if( workHour <= 40)
        wage = workHour * HOURLY_WAGE;
    else
        wage = (((workHour - 40) * (HOURLY_WAGE * 1.5)) + (40  * HOURLY_WAGE));

    if (totalSale >= 1.00 && totalSale < 99.9)
        commisstion = totalSale * 0.05;
    else if( totalSale >= 100.00 && totalSale < 299.99)
        commisstion = totalSale * 0.10;
    else
        commisstion = totalSale * 0.15;

    double netWage = commisstion + wage;

        System.out.println("    Working hour: " + workHour);
        System.out.println("     Total sales: " + totalSale);
        System.out.println("Sales commission: " + commisstion);
        System.out.println("        Net wage: " + netWage);


    }

}
