package home_0606_output;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Sample5 {
    public static void main(String[] args) throws IOException {

        PrintWriter pw = new PrintWriter("C:\\\\Users\\\\kangyeonjin\\\\Desktop\\\\Testyeonjin\\\\Testyeonjin_0528_home\\\\src\\\\main\\\\java\\\\home_0606_output/out1.txt");
        for(int i=1; i <11; i++){
            String data = i+"번쨰줄입니다";
            pw.println(data);
        }
        pw.close();

        PrintWriter pw2 = new PrintWriter(new FileWriter("C:\\Users\\kangyeonjin\\Desktop\\Testyeonjin\\Testyeonjin_0528_home\\src\\main\\java\\home_0606_output/out1.txt"));
        for(int i =11; i<21;i++){
            String data = i + "번째 줄입니다";
            pw2.println(data);
        }
        pw2.close();
    }

}
