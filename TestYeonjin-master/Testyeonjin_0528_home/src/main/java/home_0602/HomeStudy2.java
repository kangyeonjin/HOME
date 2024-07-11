package home_0602;

import java.util.HashSet;
import java.util.Arrays;

public class HomeStudy2 {
    public void home2(){

        HashSet<String> set = new HashSet<>(Arrays.asList("H", "e", "l", "l", "o"));
        System.out.println(set); //순차출력이 아님 , 집합이므로

        HashSet<Integer> s1 = new HashSet<>(Arrays.asList(1, 2, 3, 4, 5, 6));
        HashSet<Integer> s2 = new HashSet<>(Arrays.asList(4,5,6,7,8,9));

        HashSet<Integer> intersection = new HashSet<>(s1);  //s1으로 교집합생성
        intersection.retainAll(s2); //s2와의 교집합 수행
        System.out.println(intersection);

        HashSet<Integer> union = new HashSet<>(s1); //s1으로 union생성
        union.addAll(s2);  //합집합수행
        System.out.println(union);

        HashSet<Integer> substract = new HashSet<>(s1);
        substract.removeAll(s2); //차집합 수행
        System.out.println(substract);  //s1 - s2


    }

}
