package lab_6;

public class TwoEquivalent {
    public static void main(String[] args) {

        int a=1,b=1,c=1,d=1;
        //a.
        if(a==b)
            if(c==d)
                a=1;
            else
                b=1;

        //b.
        if(a==b){
            if(c==d)
                a=1;
        }else
            b=1;

        //c.
        if(a==b)
            if(c==d)
                a=1;
            else
                b=1;

            //a and c are equivalent.
    }
}
