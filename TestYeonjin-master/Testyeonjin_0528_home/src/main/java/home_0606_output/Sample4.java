package home_0606_output;

import java.io.FileWriter;
import java.io.IOException;

public class Sample4 {
    public static void main(String[] args) throws IOException {

        FileWriter fw = new FileWriter("C:\\Users\\kangyeonjin\\Desktop\\Testyeonjin\\Testyeonjin_0528_home\\src\\main\\java\\home_0606_output/out.txt");
        for (int i = 1; i < 11; i++) {
            String data = i + "번쨰 줄입니다\r\n";
            fw.write(data);
        }
        fw.close();


        //추가내용 입력
        FileWriter fw2 = new FileWriter("C:\\Users\\kangyeonjin\\Desktop\\Testyeonjin\\Testyeonjin_0528_home\\src\\main\\java\\home_0606_output/out.txt", true);
        for (int i = 1; i < 21; i++) {
            String data = i + "번쨰 줄입니다\r\n";
            fw2.write(data);
        }
        fw2.close();

    }
}


