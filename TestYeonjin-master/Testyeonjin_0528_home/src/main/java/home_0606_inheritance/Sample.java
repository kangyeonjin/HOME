package home_0606_inheritance;

public class Sample {
    public static void main(String[] args) {

//        Dog dog = new Dog();
//        dog.setName("poppy");
//        System.out.println(dog.name);
//        dog.sleep();

//        HouseDog houseDog = new HouseDog();
//        houseDog.setName("happy");
//        houseDog.sleep();
//        houseDog.sleep(3);

//        HouseDog dog = new HouseDog("happy");
//        System.out.println(dog.name);

        HouseDog happy = new HouseDog("happy");
        HouseDog yorkshire = new HouseDog(1);
        System.out.println(happy.name);
        System.out.println(yorkshire.name);


    }

}
