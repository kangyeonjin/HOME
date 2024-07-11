package chap5.section1;

import java.util.Scanner;

public class Application1 {
    public static void main(String[] args) {

        int num1 = 10;
        int num2 = 20;
        int num3 = 30;
        int num4 = 40;
        int num5 = 50;

        int sum = 0;

        sum += num1;
        sum += num2;
        sum += num3;
        sum += num4;
        sum += num5;

        System.out.println(sum);

        int[] arr = new int[5];

        for(int i = 0, value = 0; i < arr.length; i++){
            value += 10;
            arr[i] = value;
            System.out.println("arr[" + i + "]"+arr[i]);
        }

        int sum2 = 0;

        for(int i = 0; i < arr.length; i++){
            sum2 = sum2 + arr[i];

        }
        System.out.println(sum2);

        int[] iarr;
        char car[];

        int[] iarr2 = new int[5];

        System.out.println(iarr2);  //[I@77459877
        System.out.println(iarr2.length); //5
        System.out.println(iarr2.hashCode());  //2001049719
        System.out.println(iarr2.length);  //5


        Scanner sc = new Scanner(System.in);

        System.out.println("배열길이 : ");
        int size = sc.nextInt();
        double[] darr = new double[size];

        System.out.println(darr.hashCode());
        System.out.println(darr.length);


        darr = new double[30];
        System.out.println(darr.hashCode());   //186370029
        System.out.println(darr.length);  //30

//        darr = null;
//
//        System.out.println(darr.length);
    }
}
