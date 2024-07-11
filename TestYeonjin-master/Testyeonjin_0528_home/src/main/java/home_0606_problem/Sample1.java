package home_0606_problem;

import java.util.Scanner;

public class Sample1 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("첫번째 숫자를 입력하세요 :");
        int first = sc.nextInt();

        System.out.println("두번쨰 숫자를 입력하세요 : ");
        int second = sc.nextInt();

        int result = first + second;
        System.out.println(result);

    }

}
