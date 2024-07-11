package home_0605_class;

public class Animal1 {

    String name;

    public void setName(String name){
        this.name = name;  //this는 Animal클래스에 의해 생성된 객체를 지칭함
                          //setName 내부에 선언된 this바로 cat을 지칭함
    }

}
