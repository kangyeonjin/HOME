package chap5.section3;

public class Application5 {
    public static void main(String[] args) {

        int[] arr1 = {1, 2, 3, 4, 5};
        int[] arr2 = arr1.clone();

//        System.out.println(arr1);

        for(int i : arr2){
            System.out.println(i);
        }

//        for(int i : arr1){
//            System.out.println(i);
//        }

    }

}
