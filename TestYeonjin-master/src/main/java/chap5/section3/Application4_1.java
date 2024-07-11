package chap5.section3;

public class Application4_1 {
    public static void main(String[] args) {


        int[] arr1 = {1, 2, 3, 4, 5};
        int[] arr2 = arr1.clone();

        for (int i = 0; i < arr1.length; i++) {
            arr1[i] += 10;
        }

        for (int i = 0; i < arr1.length; i++) {
            System.out.println(arr1[i] + " ");
        }
        System.out.println();

        for (int i = 0; i < arr1.length; i++) {
            System.out.println(arr2[i] + " ");
        }

        for(int i : arr2){
            System.out.println(i);
        }

    }
}
