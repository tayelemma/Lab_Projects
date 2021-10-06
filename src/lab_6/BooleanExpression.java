package lab_6;

public class BooleanExpression {
    public static void main(String[] args) {
        int x = 10;
        int y = 20;
        int z = 30;

     /*
     a. According to the given value this is false. But it's not
     always false.
      */
        boolean res1 = x <  10 || x > 10;
        System.out.println(res1);



       //b.This is always false.
        boolean res2 = x > y && y > x;
           System.out.println(res2);


       /*
       c.According to the given value this is true. But it's not
        always true.
        */
       boolean res3 = (( x < y + z ) && ( x + 10 <= 20 ));
           System.out.println(res3);


       /*
       d. According to the given value this is true. But it's not
        always true.
        */
        boolean res4 =( ( z - y == x) && (Math.abs( y -z ) == x ));
            System.out.println(res4);


        //e.This is always false.
        boolean res5 =  ( x < 10 && x > 10 );
            System.out.println(res5);


        /*
        f. According to the given value this is true. It's not
        always true.
         */
        boolean res6 = (x > y || y > x);
            System.out.println(res6);


        /*
        g. According to the given value this is false. It's not always
        false.
         */
        boolean res7 = (!( x < y + z) || !( x + 10 <= 20 ));
            System.out.println(res7);


        /*
        h.According to the given value this is true. It's not
        always true.
         */
        boolean res8 = (!( x == y ) && ( x != y ) && ( x < y || y < x));
            System.out.println(res8);

    }
}
