package home_0608_problem;

import java.util.ArrayList;
import java.util.Arrays;

public class Sample2 {

    public static void main(String[] args) {

        int result =0;
        try {
            int[] a = {1, 2, 3};
            int b = a[3]; //ArrayIndexOutofBoundsException
            ArrayList c = new ArrayList(Arrays.asList("3"));
            int d = (int) c.get(0); //Classcastexception
            int e = 4/0; //ArithmeticException

        }catch (ClassCastException e){
            result += 1;
        }catch (ArithmeticException e){
            result += 3;
        }finally {  //예외와 상관없이 수행
            result +=4;
        }
        System.out.println(result  );
    }
}


