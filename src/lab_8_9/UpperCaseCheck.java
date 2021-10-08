package lab_8_9;

import java.util.Scanner;

public class UpperCaseCheck {

    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    String str;
    int count = 0;
    do{
        System.out.println("Enter the string ");
        str = input.nextLine();
        if(str.isEmpty())
            break;

        for(int i = 0; i< str.length(); i++) {
            if (Character.isUpperCase(str.charAt(i)))
                count++;
        }
        System.out.println(count);
    }while(true);
 }
}