package home_0606_trycatch;

public class Sample2 {

    public static void main(String[] args) {

        SSample ss = new SSample();
        int c;
        try{
            c = 4/0;  //4를 0으로 나눌수없으므로 오류발생
            ss.shouldBeRun();
        }catch (ArithmeticException e){
            c =-1;  //오류발생시 수행할구문
        }finally { //예외에 상관없이 무조건 수행함
            ss.shouldBeRun();
        }


    }

}
