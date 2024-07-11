package home_0606_Calculator;

import java.util.ArrayList;

public class Calculator {

    int value;

    Calculator(){
        this.value=0;
    }
    void add(int val){
        this.value += val;
    }
    int getValue(){
        return this.value;
    }

    //정수가 홀수인지 짝수인지 판별
    boolean isOdd(int num){
        return num %2 ==1;
    }

    int avg(int[] data){
        int total =0;
        for(int num : data){
            total += num;
        }
        return total /data.length;
    }

    int avg(ArrayList<Integer> data){
        int total =0;
        for(int num :data){
            total += num;
        }
        return total /data.size();
    }


}
