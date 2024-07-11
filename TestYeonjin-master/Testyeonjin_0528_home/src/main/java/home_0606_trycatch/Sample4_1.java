package home_0606_trycatch;

public class Sample4_1 {
    public static void main(String[] args) {
       Sample4 sample4 = new Sample4();
      try {
          sample4.sayNick("바보");  //예외가 발생하여 catch문으로 빠짐
          sample4.sayNick("야호");
      }catch (FoolException e){
          System.out.println("FoolException이 발생했습니다");
      }

    }
}
