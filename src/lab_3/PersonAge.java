package lab_3;

import java.util.Scanner;

public class PersonAge {
    public static void main(String[] args) {
        int bornYear;
        int recentYear;
        int age;

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the year you born");

        bornYear = input.nextInt();
        recentYear=2021;
        age = recentYear-bornYear;

        System.out.println( "You were born in " + bornYear + " and will be " + age + " this year. ");

    }
}
