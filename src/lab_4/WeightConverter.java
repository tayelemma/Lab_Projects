package lab_4;

public class WeightConverter {

    private static double MOON_GRAVITY = 0.167;
    private double weightOnEarth;

    public WeightConverter(double weightOnEarth){
        this.weightOnEarth = weightOnEarth;
    }

    public double convert() {
        double result = weightOnEarth * MOON_GRAVITY;
        return result;
    }

 public static void main(String[]args){
        WeightConverter moonWeight=new WeightConverter(200);
        System.out.println(moonWeight.convert());
}
}