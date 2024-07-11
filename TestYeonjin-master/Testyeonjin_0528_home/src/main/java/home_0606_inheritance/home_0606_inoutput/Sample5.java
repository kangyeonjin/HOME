package home_0606_inheritance.home_0606_inoutput;

import java.io.IOException;
import java.io.InputStream;

public class Sample5 {
    public static void main(String[] args) throws IOException {

        InputStream in = System.in;

        int a;
        a = in.read();
        System.out.println(a);

    }
}
