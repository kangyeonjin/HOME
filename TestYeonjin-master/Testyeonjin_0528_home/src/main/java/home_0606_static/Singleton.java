package home_0606_static;

public class Singleton {

    private static Singleton one;
    private Singleton(){

    }
    //같은 클래스이므로 private생성자 호출이 가능하다

    public static Singleton getInstance(){
        if(one == null){
            one = new Singleton();
        }
        return one;
    }

}
