package lab_7;

import java.text.DecimalFormat;

public class ConvertString {
    public static void main(String[] args) {

        DecimalFormat df = new DecimalFormat("0.00");

        int x = 200;
        String s = String.valueOf(x);
        System.out.println(x + 100);
        System.out.println(s + 100);
    }
}
