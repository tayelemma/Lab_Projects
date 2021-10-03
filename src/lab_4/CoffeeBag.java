package lab_4;
import java.text.DecimalFormat;

public class CoffeeBag {
    private static final double PRICE_PER_POUND = 5.99;
    private static final double TAX_RATE = 7.25;
    private int bagPound;
    private int bagNum;

    public CoffeeBag(){
        this.bagPound = bagPound;
        this.bagNum = bagNum;
    }

    public int getBagPound() {
        return bagPound;
    }

    public void setBagPound(int bagPound) {
        this.bagPound = bagPound;
    }

    public int getBagNum() {
        return bagNum;
    }

    public void setBagNum(int bagNum) {
        this.bagNum = bagNum;
    }

    public double totalPrice(int bagPound, int bagNum) {
        double price;
        double totalPriceWithTax;
        price = bagPound * bagNum * PRICE_PER_POUND;
        totalPriceWithTax = price + (price * (TAX_RATE/100));
        return totalPriceWithTax;
    }
    public String toString(){

      return  "Number of bags sold: " + bagNum + "\n"+
              "     Weight per bag: " + bagPound + " lb"+ "\n"+
              "    Price per pound: $" + PRICE_PER_POUND + "\n"+
              "          Sales tax: " + TAX_RATE + "%";

    }

}


