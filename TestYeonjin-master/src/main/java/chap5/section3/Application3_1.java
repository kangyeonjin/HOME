package chap5.section3;

import java.util.Arrays;

public class Application3_1 {
    public static void main(String[] args) {

        int[] originArr = new int[]{1, 2, 3, 4, 5};
//        int[] copy = originArr;
//        int[] copyArr = Arrays.copyOf(originArr,originArr.length);
//        System.out.println(Arrays.toString(copyArr));
        print(originArr);

        int[] copyArr1 = new int[10];
        for(int i =0; i <originArr.length; i++){
            copyArr1[i] = originArr[i];
        }
        int[] copyArr2 = originArr.clone();
        int[] copyArr3 = new int[10];

//        System.out.println(originArr, 0, copyArr3, 0, originArr.length);

        int[] copyArr4 = Arrays.copyOf(originArr,9);
        print(copyArr4);

    }
    public static void print(int[] iarr){
        System.out.println(iarr.hashCode());
        for(int i=0; i < iarr.length;i++){
            System.out.println(iarr[i]+" ");
        }
        System.out.println();
    }



}
