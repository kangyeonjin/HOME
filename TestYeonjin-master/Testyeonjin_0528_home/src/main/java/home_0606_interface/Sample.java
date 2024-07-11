package home_0606_interface;
//난 동물원의 사육사이다
//육식동물이 들어오면 먹이를 던져준다
//호랑이가오면 사과를 던져준다
//사자가 오면 바나나를 던져준다
public class Sample {
    public static void main(String[] args) {

//        Zookeeper zookeeper = new Zookeeper();
        Tiger tiger = new Tiger();
        Lion lion = new Lion();
        Bouncer bouncer = new Bouncer();
//        zookeeper.feed(tiger);
//        zookeeper.feed(lion);
        bouncer.barkAnimal(tiger);
        bouncer.barkAnimal(lion);

    }
}
