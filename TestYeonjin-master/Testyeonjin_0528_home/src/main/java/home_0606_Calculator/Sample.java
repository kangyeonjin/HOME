package home_0606_Calculator;

import java.util.ArrayList;
import java.util.Arrays;

public class Sample {
    public static void main(String[] args) {

        Calculator cal = new Calculator();
        cal.add(10);
        System.out.println(cal.getValue());

        UpgradeCalculator cal2 = new UpgradeCalculator();
        cal2.add(10);
        cal2.minus(3);
        System.out.println(cal2.getValue());

        MaxLimitCalculator max = new MaxLimitCalculator();
        max.add(50);
        max.add(60);
        System.out.println(max.getValue());

        System.out.println(cal.isOdd(3));
        System.out.println(cal.isOdd(4));

        int[] data = {1, 2, 3, 5, 7, 9};
        Calculator cal3 = new Calculator();
        int result = cal3.avg(data);
        System.out.println(result);
        ArrayList<Integer> data2 = new ArrayList<>(Arrays.asList(1, 3, 5, 7, 9));
        int result2 = cal3.avg(data2);
        System.out.println(result2);

    }

}
