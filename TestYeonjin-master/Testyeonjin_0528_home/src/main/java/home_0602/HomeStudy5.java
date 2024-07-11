package home_0602;

import java.util.ArrayList;
import java.util.Arrays;

public class HomeStudy5 {
    public void home() {

        String num = "123";
        int n = Integer.parseInt(num);  //문자를 정수로 바꾸기
        System.out.println(n);

    }

    public void home2(){

        int n =123;
        String num = ""+n;  //정수를 문자로 바꾸기
        System.out.println(num);

    }

    public void home3(){

        int n = 123;
        String num1 = String.valueOf(n);  //정수로바꿈
        String num2 = Integer.toString(n);  //문자열로바꿈
        System.out.println(num1);
        System.out.println(num2);

        String num = "123.456";
        double d = Double.parseDouble(num);
        System.out.println(d);

    }

    public void home4(){

        final int n=123;  //final로 설정하면 값 변경 불가능
        final ArrayList<String> a = new ArrayList<>(Arrays.asList("a", "b"));
//        a = new ArrayList<>(Arrays.asList("c","d"));
        //재할당만 안됨 더하거나 뺄수있음
    }

}
