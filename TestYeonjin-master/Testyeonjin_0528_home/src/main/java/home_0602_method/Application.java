package home_0602_method;

public class Application {
    public static void main(String[] args) {
        int a = 3;
        int b =4;

        Sample sample = new Sample();
        int c = sample.sum(a, b);
        System.out.println(c);

        String d = sample.say();
        System.out.println(d);

        int e =1;
        sample.varTest(e);
        System.out.println(e);
    }
}
