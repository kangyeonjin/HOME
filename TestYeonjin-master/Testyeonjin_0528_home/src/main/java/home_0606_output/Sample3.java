package home_0606_output;

import java.io.IOException;
import java.io.PrintWriter;

public class Sample3 {

    public static void main(String[] args)throws IOException {

        PrintWriter pw = new PrintWriter("C:\\Users\\kangyeonjin\\Desktop\\Testyeonjin\\Testyeonjin_0528_home\\src\\main\\java\\home_0606_output/out.txt");
        for(int i=1; i<11;i++){
            String data = i + "번쨰 줄입니다";   //\r\n을 제거해도됨
            pw.println(data);
        }
        pw.close();

    }

}
