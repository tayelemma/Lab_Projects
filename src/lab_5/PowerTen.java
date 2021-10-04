package lab_5;

import java.util.Scanner;

public class PowerTen {
        public static void main(String args[]) {
            String str;
            int number;

            Scanner scanner = new Scanner(System.in);
            System.out.print("Please enter a power of 10 greater or equal to 6. ");
            number = scanner.nextInt();

            switch (number) {
                case 8:
                    str = "Million";
                    break;
                case 11:
                    str = "Billion";
                    break;
                case 14:
                    str = "Trillion";
                    break;
                case 17:
                    str = "Qaudrillion";
                    break;
                case 20:
                    str = "Quintillion";
                    break;
                case 23:
                    str = "Sextillion";
                    break;
                case 30:
                    str = "Nonillion";
                    break;
                case 100:
                    str = "Googol";
                    break;
                default:
                    str = "Invalid";
                    break;
            }
            System.out.println("10 the power of " + number + " is " +  Math.pow(10,number) + " " + str);
        }
    }

