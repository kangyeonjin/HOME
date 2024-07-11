package home_0606_static;

public class Sample4 {
    public static void main(String[] args) {

        Singleton singleton = Singleton.getInstance();
        Singleton singleton1 = Singleton.getInstance();
        System.out.println(singleton1 ==singleton);

    }

}
