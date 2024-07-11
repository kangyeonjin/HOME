package home_0606_interface2;

interface Predator{
    String getFood();

    default void printFood(){
        System.out.println(getFood());
    }
    int LEG_COUNT =4;
    static int speed(){
        return LEG_COUNT*30;
    }
}
interface Barkable{
    void bark();
}
interface BarkablePredator extends Predator,Barkable{

}

class Animal{
    String name;

    void setName(String name){
        this.name =name;
    }
}

class Tiger extends Animal implements Predator,Barkable{

    public String getFood(){
        return "apple";
    }
    public void bark(){
        System.out.println("어흥");
    }
}
class  Lion extends Animal implements Predator,Barkable{

    public String getFood(){
        return "banana";
    }
    public void bark(){
        System.out.println("으르렁");
    }

}
class Zookeeper{
    void feed(Predator predator){
        System.out.println("feed"+predator.getFood());
    }

}
class Bouncer{
  void barkAnimal(Barkable animal){
     animal.bark();
  }
}
public class Sample{
    public static void main(String[] args) {
        Zookeeper zookeeper=  new Zookeeper();
        Tiger tiger = new Tiger();
        Lion lion = new Lion();

        zookeeper.feed(tiger);
        zookeeper.feed(lion);

        Bouncer bouncer =new Bouncer();
        bouncer.barkAnimal(tiger);
        bouncer.barkAnimal(lion);
    }
}