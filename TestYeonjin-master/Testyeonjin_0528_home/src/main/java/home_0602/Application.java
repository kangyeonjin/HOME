package home_0602;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Comparator;

public class Application {
    public static void main(String[] args) {
//
//        String[] array = {"Apple","Banana","Cherry"};
//        List<String> list = Arrays.asList(array);
//        System.out.println(list);
//
//        array[0] = "Apriicot";
//        System.out.println(list);
//
//        ArrayList<String> pitches = new ArrayList<String>(Arrays.asList("138,129,142"));
//        String result = "";
//
//        for(int i=0; i<pitches.size();i++){
//            result += pitches.get(i);
//            result += ",";
//        }
//
//        result = result.substring(0, result.length() - 1);//마지막콤마는 제거함
//
//        System.out.println(result);

        ArrayList<String> pitches = new ArrayList<>(Arrays.asList("138","129","142"));
        String result = String.join(",", pitches);  //콤마추가
//        pitches.sort(Comparator.naturalOrder());  //오름차순정렬
        pitches.sort(Comparator.reverseOrder()); //내림차순정렬

        System.out.println(pitches);

    }
}
