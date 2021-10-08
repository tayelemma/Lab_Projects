/*
There are 25 primes between 2 and 100, and there are 1229 primes between
2 and 10,000. Write a program that inputs a positive integer N > 2 and
displays the number of primes between 2 and N (inclusive).
 */
package lab_7;

import java.util.Scanner;

public class Display_Num_Of_Prime {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a positive integer number ");
        int number = input.nextInt();
        int count = 0;
        for (int i = 2; i < number; i++) {
            if (isNumberPrime(i))
                count++;
        }
        System.out.println(count);
    }

    public static boolean isNumberPrime(int number) {
        if (number < 2)
            return false;
        for (int i = 2; i <= number - 1; i++) {
            if (number % i == 0)
                return false;
        }
        return true;
    }
}