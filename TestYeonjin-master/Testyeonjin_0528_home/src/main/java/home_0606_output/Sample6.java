package home_0606_output;

import java.io.FileInputStream;
import java.io.IOException;

public class Sample6 {
    public static void main(String[] args) throws IOException {

        byte[] b = new byte[1024];
        FileInputStream input = new FileInputStream("C:\\Users\\kangyeonjin\\Desktop\\Testyeonjin\\Testyeonjin_0528_home\\src\\main\\java\\home_0606_output/out1.txt");
        input.read(b);
        System.out.println(new String(b));
        input.close();
    }

}
