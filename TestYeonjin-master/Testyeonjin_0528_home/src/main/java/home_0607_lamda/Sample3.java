package home_0607_lamda;

import java.util.Arrays;
import java.util.Comparator;

public class Sample3 {
    public static void main(String[] args) {

        int[] data = {5, 6, 4, 2, 3, 1, 1, 2, 2, 4, 8};
        int[] result = Arrays.stream(data)  //InStream을 생성한다
                .boxed()  //InStream을 Stream<Integer>로 변경한다
                .filter((a)-> a % 2 ==0)//짝수만 뽑기
                .distinct()//중복을 제거
                .sorted(Comparator.reverseOrder()) //역순으로 정렬
                .mapToInt(Integer::intValue) //Stream<Integer>를 IntStream으로 변경
                .toArray() //int[]배열로 반환함
                ;

    }

}
