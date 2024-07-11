package chap6.section5.prameter;

import org.w3c.dom.ls.LSOutput;

public class ParameterTest {

    public void testPrimaryTypeParameter(int num){

        System.out.println(num);

    }

    public void testPrimaryTypeArryParameter(int[] iarr){
        System.out.println("배열의 값출력");

        for(int i=0; i <iarr.length;i++){
            System.out.println(iarr[i]+"");
        }
        System.out.println();
    }



//    public void testClass

}
