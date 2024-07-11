package home_0605_class;

public class Application {
    public static void main(String[] args) {

        Animal1 cat = new Animal1();  //cat이라는 객체를 만들고
        cat.setName("boby");   //cat객체를 사용하여 setName메서드를 호출하면

        Animal1 dog = new Animal1();
        dog.setName("happy");

        System.out.println(cat.name);
        System.out.println(dog.name);
    }
}
