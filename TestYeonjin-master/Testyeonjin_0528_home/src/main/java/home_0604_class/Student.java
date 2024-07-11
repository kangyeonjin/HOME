package home_0604_class;

class School{

    String name;

    public void setName(String name){  //입력 string name, 출력 void
        this.name=name;  //this는 stu를 가리킴
    }

}

public class Student {

    public static void main(String[] args) {

        School stu = new School();
        stu.setName("momo");

        School stu2 = new School();
        stu2.setName("nono");

        System.out.println(stu.name);
        System.out.println(stu2.name);
    }

}
