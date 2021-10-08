package lab_8_9;

import java.util.Scanner;

public class VowelsCount {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        do {
            System.out.println("Enter a sentence please");
            String str = input.nextLine();
            if(str.isEmpty())break;
            int count = 0;
            for (int i = 0; i < str.length(); i++) {

                if (str.charAt(i) == 'a')
                    count++;
            }
            System.out.println("# of 'a' : " + count);


            int count1 = 0;
            for (int i = 0; i < str.length(); i++) {
                if (str.charAt(i) == 'e')
                    count1++;
            }
            System.out.println("# of 'e' : " + count1);


            int count2 = 0;
            for (int i = 0; i < str.length(); i++) {
                if (str.charAt(i) == 'i')
                    count2++;
            }
            System.out.println("# of 'i' : " + count2);


            int count3 = 0;
            for (int i = 0; i < str.length(); i++) {
                if (str.charAt(i) == 'o')
                    count3++;
            }
            System.out.println("# of 'o' : " + count3);


            int count4 = 0;
            for (int i = 0; i < str.length(); i++) {
                if (str.charAt(i) == 'u')
                    count4++;
            }
            System.out.println("# of 'u' :" + count4);
        }while(true);

        }

    }

