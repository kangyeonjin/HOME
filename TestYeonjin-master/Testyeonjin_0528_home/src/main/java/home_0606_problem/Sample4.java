package home_0606_problem;

//사용자의 입력을 sample파일에 저장하는 프로그램
//프로그램을 다시 실행하더라도 기존에 작성한 내용을 유지하고 새로입력한 내용을 추가해야한다

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Sample4 {
    public static void main(String[] args) throws IOException {

//        FileWriter fw = new FileWriter("sample.txt",true); //true기재 : 내용 초기화 되지 않고 이어서 추가됨
        PrintWriter pw = new PrintWriter(new FileWriter("sample.txt",true));
        System.out.println("문장을 입력하세요 :");
        Scanner sc = new Scanner(System.in);
        String line = sc.nextLine();
//        fw.write(String.format("%s\n",line));
//        fw.close();
        pw.println(line);
        pw.close();


    }

}
