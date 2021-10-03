package lab_4;

import java.text.DecimalFormat;
import java.util.Scanner;

public class CoffeeBagMain {
        public static void main(String[] args) {

            CoffeeBag coffee = new CoffeeBag();
            coffee.setBagNum(5);
            coffee.setBagPound(32);
            System.out.println(coffee);

            DecimalFormat sdf = new DecimalFormat("0.00");
            double n = coffee.totalPrice(5, 32);

            System.out.println("        Total price: $" + sdf.format(n));
        }
}
