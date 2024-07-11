package chap5.section3;

public class Application2_1 {
    public static void main(String[] args) {

        String[] names = {"홍길동", "유관순", "이순신"};
//        System.out.println(names);
        System.out.println(names.hashCode());
        
//        print(names);

        String[] animals = getAnimals();

        System.out.println(animals.hashCode());

//        print(animals);

    }

    public static String[] getAnimals(){

        String[] animals = new String[]{"Bear","Koala","Gorilla"};
        System.out.println(animals.hashCode());

        return animals;
    }


    public void print(String[] sarr){
        System.out.println(sarr.hashCode());

        for(int i=0; i < sarr.length; i++){
            System.out.println(sarr[i]+" ");
        }
        System.out.println();
    }
}
