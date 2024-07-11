package home_0605_class;

class Animal{

    String name;    //객체 변수

    public void setName (String name){
        this.name =name;
    }

}

public class Sample {

    public static void main(String[] args) {

        Animal1 cat = new Animal1();   //Animal클래스의 인스턴스인 cat, Animal의 객체가 만들어짐
        cat.setName("boby");  //boby를 입력값으로 setName메서드를 호출함 name에는 boby라는 문자열이 전달될것

        Animal1 dog = new Animal1();
        dog.setName("happy");


        System.out.println(cat.name); //출력값 null
        System.out.println(dog.name);
    }

}
