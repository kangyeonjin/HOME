package home_0606_inheritance.home_0606_inoutput;

import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;

public class Sample4 {
    public static void main(String[] args) throws IOException {

        FileWriter fw = new FileWriter("c:/out.txt");
        for(int i=1; i<11; i++){
            String data = i+"\r\n";
            fw.write(data);
        }
        fw.close(); //사용한 파일객체를 닫아주기 위한 코드

    }

}
