package lab_7;

import java.util.Scanner;

public class Prime_Or_Not {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        while (true) {
            System.out.println("Enter a positive integer number. ");
            int number = input.nextInt();
            if (number < 0)
                break;
            if (isNumberPrime(number))
                System.out.println("Prime");
            else
                System.out.println("Not prime");
        }
    }

    public static boolean isNumberPrime(int number) {
        if (number < 2 )
            return false;
        for (int i = 2; i <= number - 1; i++) {
            if (number % i == 0)
                return false;
        }
        return true;
    }
}