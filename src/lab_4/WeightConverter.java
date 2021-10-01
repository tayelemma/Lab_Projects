package lab_4;

public class WeightConverter {
    private double earthGravity;


    public static double convert(double originalWeight) {
        double result = originalWeight * 0.167;
        return result;

    }
public static void main(String[]args){

        WeightConverter moonWeight=new WeightConverter();

        double yourMoonWeight = moonWeight.convert(200);

        System.out.println(yourMoonWeight);
}
}