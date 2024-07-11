package home_0606_trycatch;

public class Sample {
    public static void main(String[] args) {

        int c;

        try {
            c =4/0;  //수행할문장

        }catch (ArithmeticException e){
            c = -1; //예외가 발생하여 문장이 수행됨
        }

    }

}
