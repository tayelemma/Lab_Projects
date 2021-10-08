package lab_7;

public class Number_Sum {
    public static void main(String[] args) {


        int sum = 0, sum1 = 0 ,sum2 =0, sum3=0, sum4=0, sum5=0, sum6=0;
        int num = 1 , num1 = 1, num2 = 1, num3 = 1;


    //for loop

    for (int i = 1; i<=100; i++) {
        sum = sum + i;
    }
        System.out.println(sum);


    for (int i = 5; i<=100; i+=5) {
        sum1 = sum1  + i;
    }
    System.out.println(sum1);


    //While loop

    while(num<=100){
        sum2 = sum2 + num;
        num++;
    }
        System.out.println(sum2);

    while(num1<=100){
        sum3 = sum3 + num1;
        num1 = num1 + 5;
    }
        System.out.println(sum3);

    //Do-while loop

    do {
        sum4 = sum4 + num2;
        num2++;

    }while (num2 <= 100) ;
        System.out.println(sum4);



    do {
        sum5 = sum5 + num3;
        num3 = num3 + 5;

    }while (num3 <= 100) ;
        System.out.println(sum5);

    }
}
