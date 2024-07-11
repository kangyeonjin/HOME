package home_0606_problem;

import java.util.Scanner;

public class Sample2 {
    public static void main(String[] args) {

        while(true){
            Scanner sc = new Scanner(System.in);
            System.out.println("영어문장을 입력하세요 :");
            String line = sc.nextLine();
            if("END".equals(line)){
                break;
            }
            System.out.println(line.toUpperCase());  //대문자로 변경하여 출력
        }

    }

}
