package home_0606_output;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Sample7 {

    public static void main(String[] args) throws IOException {
   //파일을 한줄단위로 읽기
        BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\kangyeonjin\\Desktop\\Testyeonjin\\Testyeonjin_0528_home\\src\\main\\java\\home_0606_output\\out2.txt"));
        while(true){
            String line = br.readLine();
            if(line==null) break;
            System.out.println(line);
        }
        br.close();
    }
}
