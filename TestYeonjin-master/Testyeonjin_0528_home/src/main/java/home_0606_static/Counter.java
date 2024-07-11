package home_0606_static;

public class Counter {

//    int count =0;
    static int count =0;

    Counter(){
        count++;
        System.out.println(count);
    }

    public static int getCount(){
        return count;
    }

}


