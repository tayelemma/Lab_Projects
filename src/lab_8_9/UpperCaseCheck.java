package lab_8_9;

import java.util.Scanner;

public class UpperCaseCheck {

    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    String str;
    int count = 0;
    while(true){
        System.out.println("Enter string to find the upper case and enter blank string to end the program");
        str = input.nextLine();
        if(str.isEmpty()) {
            System.out.println("Program End");
            break;
        }
        for(int i = 0; i< str.length(); i++) {
            if (Character.isUpperCase(str.charAt(i)))
                count++;
        }
        System.out.println(count);
    }
 }
}