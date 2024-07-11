package home_0607_lamda;

import java.util.function.BiFunction;

public class Sample {

    public static void main(String[] args){
        BiFunction<Integer,Integer,Integer> mc =(a,b) ->a+b;
        int result = mc.apply(3, 4);
//        Calculator mc = Integer::sum;
//        int result = mc.sum(3, 4);
        System.out.println(result);

    }

}
