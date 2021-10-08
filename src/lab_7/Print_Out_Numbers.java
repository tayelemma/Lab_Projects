/*
Write a program to print out the number 10 through
49 in the following.
 */

package lab_7;

public class Print_Out_Numbers {
    public static void main(String[] args) {

        int num = 10;
        for(int r = 0; r < 4; r++){
            for(int c = 0; c < 10; c++){
                System.out.print(num + " " );
                num++;
            }
            System.out.println("");
        }
    }
}
