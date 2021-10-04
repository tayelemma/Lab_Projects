package lab_3;

public class Expression {
    public static void main(String[] args) {

        int A = 1, B = 1, C=1, x=1,y=1,R=1;

        double num1 = Math.sqrt(B*B + 4*A*C);
        System.out.println (num1);

        double num2 = Math.sqrt(x + 4 * Math.pow(y,3));
        System.out.println(num2);

        double num3 = Math.cbrt(x*y);
        System.out.println(num3);

        double num4 = Math.PI * R * R;
        System.out.println(num4);
    }
}
