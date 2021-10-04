/*
Writ a method called calcTaxRate() that will take martial status (single or married) and salary
then return the tax rate, The table below refers to the corresponding tax rate according to the
 given martial status and salary.

 */
package lab_7;

import java.util.Scanner;

public class CalcRate {
    public static final double HIGH_TAX_RATE = 0.18;
    public static final double LOW_TAX_RATE = 0.10;
    public static final double SINGLE_TAX_TRASHHOLD = 40000;
    public static final double MARRIED_TAX_TRASHHOLD = 60000;
    static String status;
    static double salary;


    public static double calcTaxRate(String status, double salary) {
        if (status.equals("single")) {
            if (salary > SINGLE_TAX_TRASHHOLD) {
                return HIGH_TAX_RATE;
            } else
                return LOW_TAX_RATE;
        } else {
            if (status.equals("married")) {
                if (salary > SINGLE_TAX_TRASHHOLD)
                    return HIGH_TAX_RATE;
            } else {
                return LOW_TAX_RATE;

            }
        }

public static double calcTaxRate2(String status, double salary){
            boolean isLowRate=((status.equals("single") && salary <= SINGLE_TAX_TRASHHOLD)|| (status.equals("married"))&& salary <=MARRIED_TAX_TRASHHOLD);
                if(isLowRate)
                    return LOW_TAX_RATE;
                else
                    return HIGH_TAX_RATE;
        }

        }
        public static void calcLuggageWeight(double weight){
            double fee = 10;
            if(weight<=23)
                System.out.println("No fee");
            else
                fee = fee + (weight-23)*2;
                System.out.println(fee);

        }
    public static void main (String[]args){

        CalcRate rate = new CalcRate();
        System.out.println(rate.calcTaxRate("single", 60000));
    }
}