package home_0604_class;

class Animal {

    String name;   //1번

    public void setName(String name){
        this.name =name;  //3번.Animal클래스의 객체변수인 name에 값을 대입
    }

}

class Sample {
    public static void main(String[] args) {
        Animal cat = new Animal();
        cat.setName("boby");  //4번 setName메서드 호출

        Animal dog = new Animal();
        dog.setName("happy");

        System.out.println(cat.name);  //2번
        System.out.println(dog.name);
    }

}

