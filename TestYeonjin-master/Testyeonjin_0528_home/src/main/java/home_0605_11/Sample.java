package home_0605_11;
//count를 update를 이용해 증가하고자함
public class Sample {
    public static void main(String[] args) {

        Counter myCounter = new Counter();
        System.out.println(myCounter.count);

        Updater myUpdater = new Updater();
        myUpdater.update(myCounter);
        System.out.println(myCounter.count);

    }

}
