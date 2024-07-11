package home_0606_problem;
//파일 내용바꾸기

import org.w3c.dom.CDATASection;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

//줄단위로 읽어 리스트에 저장하고
//문자열로 변경한후, 문자열 python을 java로 변경하여 다시 sample파일에 저장함
//파일의 내용을 한줄단위로 읽어 리스트에 저장했기 떄문에
//리스트 데이터를 다시 문자열로 만들떄에는반드시 줄바꿈 문자를 포함하여 만들어야한다
public class Sample5 {
    public static void main(String[] args) throws IOException {

        ArrayList<String> data = new ArrayList<>();

        BufferedReader br = new BufferedReader(new FileReader("sample.txt"));
        while (true) {
            String line = br.readLine();
            if (line == null) break;
            data.add(line);
        }
        br.close();

        //줄단위로 읽으면 줄바꿈 문자가 없어지므로 줄바꿈 문자를 포함한다.
        String text = String.join("\n", data);

        //변경할 글자를 입력함
        text = text.replaceAll("hi", "java");

        //변경된내용을 다시 파일에 적는다
        FileWriter fw = new FileWriter("sample.txt");
        fw.write(text);
        fw.close();
    }
}
