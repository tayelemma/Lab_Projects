package lab_5;

import java.text.DecimalFormat;
import java.util.Scanner;

public class EmployeeFatBurger {
    static double HOURLY_WAGE = 7.25;
    static int REGULAR_WORK_HOURS= 40;
    public static void main(String[] args) {
        int workHour;
        double totalSale;
        double wage;
        double commisstion;

        Scanner input = new Scanner(System.in);
        System.out.print("Please enter work hours: ");
        workHour = input.nextInt();
        System.out.print("Please enter the total sales: ");
        totalSale = input.nextDouble();

    if( workHour <= REGULAR_WORK_HOURS)
        wage = workHour * HOURLY_WAGE;
    else
        wage = (((workHour - REGULAR_WORK_HOURS) * (HOURLY_WAGE * 1.5)) + (REGULAR_WORK_HOURS  * HOURLY_WAGE));

    if (totalSale >= 1.00 && totalSale < 99.9)
        commisstion = totalSale * 0.05;
    else if( totalSale >= 100.00 && totalSale < 299.99)
        commisstion = totalSale * 0.10;
    else
        commisstion = totalSale * 0.15;
        DecimalFormat df = new DecimalFormat("0.00");

    double netWage = commisstion + wage;

        System.out.println("    Working hour: " + workHour + " hr");
        System.out.println("     Total sales: $" + df.format(totalSale));
        System.out.println("Sales commission: $" + df.format(commisstion));
        System.out.println("        Net wage: $" + df.format(netWage));


    }

}
