package home_0606_output;

import java.io.FileWriter;
import java.io.IOException;

public class Sample2 {
    public static void main(String[] args) throws IOException {

      //byte배열대신 문자열을 사용할수있음
        FileWriter fw = new FileWriter("C:\\Users\\kangyeonjin\\Desktop\\Testyeonjin\\Testyeonjin_0528_home\\src\\main\\java\\home_0606_output/out.txt");
        for(int i=1; i<11; i++){
            String data = i + "번째 줄입니다\r\n";
            fw.write(data);
        }
        fw.close();

    }

}
