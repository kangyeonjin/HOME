package home_0607_lamda;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashSet;

public class Sample2 {

    public static void main(String[] args) {

        int[] data = {5, 6, 4, 2, 3, 1, 1, 2, 2, 4, 8};

        ArrayList<Integer> dataList = new ArrayList<>();
        for(int i =0; i <data.length; i++){
            if(data[i] %2==0){
                dataList.add(data[i]);
            }
        }

        //set을 사용해 중복을 제거
        HashSet<Integer> dataSet = new HashSet<>(dataList);

        //set을 다시 list로 변경
        ArrayList<Integer> distinctList = new ArrayList<>(dataSet);

        //역순으로 정렬(내림차순)
        distinctList.sort(Comparator.reverseOrder());

        //Integer리스트를 정수배열로 변환
        int[] result = new int[distinctList.size()];
        for(int i=0; i<distinctList.size(); i++){
            result[i] = distinctList.get(i);
        }


    }

}
