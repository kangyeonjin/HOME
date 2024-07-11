package chap5.section2;

public class Application4 {
    public static void main(String[] args) {

        int[][] iarr = {{1, 2, 3, 4, 5}, {6, 7, 8, 9, 10}, {11, 12, 13, 14, 15}};
//        System.out.println(iarr.length);  //행 출력
//        System.out.println(iarr[0].length);  //열 출력
//
//        int value = iarr[1][0];
//        System.out.println(value);  //2행의 1번째 값 출력

//정변
        for(int i =0; i <iarr.length; i++){
            for(int j =0; j <iarr[i].length; j++){
                System.out.println(iarr[i][j]+" ");
            }
            System.out.println();
        }


//가변
        int[][] iarr2 = {{1, 2, 3}, {4, 5, 6, 7}, { 8, 9, 10, 11, 12}};
        for(int i=0; i<iarr2.length; i++){
            for(int j=0; j<iarr2[i].length; j++){
                System.out.println(iarr2[i][j]+" ");
            }
            System.out.println();
        }

        int[] arr1 = {1,2,3,4,5};
        int[] arr2 = {6,7,8,9,10};

        int[][] iarr3 = {arr1,arr2};
        for(int i = 0; i <iarr3.length;i++){
            for(int j=0;j<iarr3[i].length;j++){
                System.out.println(iarr3[i][j]+" ");
            }
            System.out.println();
        }

    }

}
