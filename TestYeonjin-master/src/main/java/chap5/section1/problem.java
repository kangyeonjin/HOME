package chap5.section1;

import java.util.Scanner;

public class problem {
    public static void main(String[] args) {


//         5명의 자바 점수를 정수로 입력받아서
//         합계와 평균을 실수로 구하는 프로그램

        int[] scores = new int[5];  //열 생성
        Scanner sc = new Scanner(System.in);  //입력받아요

        int sum = 0;   //합계 넣을 공간생성
        double avg = 0;  //평균 넣을 공간생성

        for(int i = 0; i <scores.length; i++){  //for사용해서 i변수로 반복,i는 scores보다 적게 반복하되 하나씩증가
            System.out.println((i + 1));       //i에 +1을해서 . 출력
            scores[i] = sc.nextInt();          //scores에 i넣고 반복해서
        }
        for(int i =0; i < scores.length;i++){
            sum = sum + scores[i];
        }

        avg = (double)sum/scores.length;

        System.out.println(sum);
        System.out.println(avg);

    }
}
