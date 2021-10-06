package lab_6;

public class IndentProperly {
    public static void main(String[] args) {
        int a=1,b=1,c=1,d=1;
    //a.
        if(a == b)
            if(c==d)
                a=1;
            else
                b=1;
        else
            c=1;

    //b.
        if( a == b)
            a=1;
             if(c ==d)
                b=1;
             else
                 c=1;

     //c.
        if(a==b){
            if(c==d)
                a=1;
            b=2;
        }else
            b=1;

    //d.
        if (a==b){
            if(c==d)
                a=1;
                b=2;
        }else{
            b=1;
            if(a==d)
                d=3;
        }
    }
}
