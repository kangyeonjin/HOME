package chap5.section4;

public class Application4 {
    public static void main(String[] args) {
        //버블
        int[] iarr = {2, 5, 4, 6, 1, 3};
        int temp;

        for (int i = iarr.length - 1; i >= 0; i--) {
            for (int j = 0; j < i; j++) {

                if (iarr[j] > iarr[j + 1]) {
                    temp = iarr[j];
                    iarr[j] = iarr[j + 1];
                    iarr[j + 1] = temp;
                }
            }

        }
    }
}