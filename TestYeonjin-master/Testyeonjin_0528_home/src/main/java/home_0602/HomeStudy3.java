package home_0602;

import java.util.Arrays;
import java.util.HashSet;

public class HomeStudy3 {

    public void home() {
        //집합에 내용추가하기
        HashSet<String> set = new HashSet<>();
        set.add("jump");
        set.add("to");
        set.add("java");
        set.addAll(Arrays.asList("from", "book")); //여러개 추가시 addAll
        set.remove("to"); //지우기

        System.out.println(set);



    }
}
