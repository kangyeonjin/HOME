package home_0602;

import java.util.ArrayList;
import java.util.Arrays;

public class HomeStudy9 {
    public void forEachHome() {

        String[] numbers = {"one", "two", "three"};
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }

        //for each문 사용 위내용과 같음
        for (String number : numbers) {
            System.out.println(number);
        }

        ArrayList<String> numbers1 = new ArrayList<>(Arrays.asList("one", "two", "three"));
        for (String number2 : numbers1) {
            System.out.println(number2);
        }

    }

    public void problem1() {

        String a = "write once, run anywhere";
        if (a.contains("wife")) {
            System.out.println("wife");
        } else if (a.contains("once") && !a.contains("run")) {
            System.out.println("once");
        } else if (!a.contains("everywhere")) {
            System.out.println("everywhere");
        } else if (a.contains("anywhere")) {
            System.out.println("anywhere");
        } else {
            System.out.println("none");
        }

    }

    public void problem2() {

        int result = 0;
        int i = 1;
        while (i <= 1000) {
            if (i % 3 == 0) {
                result += i;
            }
            i += 1;
        }
        System.out.println(result);
    }

    public void problem3() {

        int i = 0;
        while (true) {
            i += 1;
            if (i > 5) {
                break;
            }
            for (int j = 0; i > j; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }

    }

    public void problem3_1() {

        int i = 5;
        while (i > 0) {
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println("");
            i--;
        }

    }

    public void problem3_2() {

        int i = 0;
        while (true) {
            i += 1;
            if (i > 5) {
                break;
            }
            for (int j = 0; i > j; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }
        i = 5;
        while (i > 0) {
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println("");
            i--;
        }

    }

    public void problem3_3() {

        int height = 5;
        for (int i = 1; i <= height; i++) {

            for (int j = 1; j <= height - i; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= 2 * i - 1; k++) {
                System.out.print("*");
            }
            System.out.println();

        }

    }
    public void problem4(){

        //for문사용해 1~100까지 숫자를 출력

        for(int i=1; i<=100;i++){
            System.out.println(i);
        }


    }

    public void problem5(){

        //A학급에 10명의 학생의 중간고사점수 평균구하기
        //70,60,55,75,95,90,80,80,85,100

        int[] marks = {70, 60, 55, 75, 95, 90, 80, 80, 85, 100};
        int total =0;

        for(int mark : marks){
            total += mark;

        }
        float average = (float) total/marks.length;
        System.out.println(average);


    }

}