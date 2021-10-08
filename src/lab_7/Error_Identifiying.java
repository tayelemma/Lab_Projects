package lab_7;

import java.util.Scanner;

public class Error_Identifiying {
    public static void main(String[] args) {
    //a. It is infinite loop
        int x;   //
        int y=1;  //
        int a;    //
        int b=1;  //
        for(int i = 10; i>0; i++){
            x=y;
            a=b;
    //b num is not declared, and it should be while not until.
        int sum = 0;
        int num;  //number was not declared
        Scanner scanner = new Scanner(System.in);
        do {
            num = scanner.nextInt();
            sum += num;
        } while(sum > 10000);// while is the missing

     //c. This condition will never be true.
            while (x < 1 && x > 10) {
                a = b;
            }

     //d. Semicolon should not be included.
            while (a == b) ;
            {
                a = b;
                x = y;
            }
        }
    }
}

