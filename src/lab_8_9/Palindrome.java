package lab_8_9;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Palindrome {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        while (true) {

            String rev = "";
            System.out.println("Enter a string please");
            String str = input.nextLine();

            if (str.equals("")) {
                System.out.println("end");
                break;
            } else {
                for (int i = str.length() - 1; i >= 0; i--) {
                    rev = rev + str.charAt(i);
                }
                System.out.println(rev);
            }

                boolean isSame = str.equalsIgnoreCase(rev);
                if (isSame) {
                    System.out.println("palindrome");
                } else {
                    System.out.println("not palindrome");
                }
            }
        }
    }
