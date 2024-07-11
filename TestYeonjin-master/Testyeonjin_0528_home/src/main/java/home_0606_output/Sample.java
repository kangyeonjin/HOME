package home_0606_output;

import java.io.FileOutputStream;
import java.io.IOException;

public class Sample {
    public static void main(String[] args) throws IOException {
        //byte단위로 데이터를 처리함
        FileOutputStream output = new FileOutputStream("C:\\Users\\kangyeonjin\\Desktop\\Testyeonjin\\Testyeonjin_0528_home\\src\\main\\java\\home_0606_output/out.txt");
        for(int i=1; i<11; i++){
            String data = i+"번쨰 줄입니다\r\n";
            output.write(data.getBytes());  //생성한 파일에 내용입력
        }

        output.close();
    }

}
