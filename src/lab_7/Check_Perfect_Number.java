package lab_7;

import java.util.Scanner;

public class Check_Perfect_Number {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a program that accepts a positive integer. ");
        int num = input.nextInt();
        Check_Perfect_Number x = new Check_Perfect_Number();
        x.printAllDivisors(num);

    }
    public void printAllDivisors(int number) {
        int sum = 0;
        for (int i = 1; i < number; i++) {
            if (number % i == 0){
                sum = sum + i;
                System.out.print(i + " "+ "\n");
             }

        }
            if (sum == number) {
                System.out.println(sum +  " = " + number + " It is perfect Number ");
            }else{
                System.out.println(sum +" != "+ number +" it is not a perfect number" );
        }
    }
}