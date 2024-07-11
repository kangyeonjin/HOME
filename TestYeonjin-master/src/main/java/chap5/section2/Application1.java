package chap5.section2;

public class Application1 {
    public static void main(String[] args) {
//        자료형[][] 변수명 = new 자료형[할당할 배열의 갯수][할당할 배열의 길이];

        int[][] arr;
        int arr2[][];

        arr = new int[3][];  //3열을 만듬

        arr[0] = new int[5];
        arr[1] = new int[5];
        arr[2] = new int[6];
//        System.out.println(arr.length);

        arr2 = new int[3][5];       //3*5를 만듬
//        System.out.println(arr2.length);
//        System.out.println(arr);
        for(int i = 0; i < arr2[0].length; i++){   //반복문으로 i변수에 3*5를 가져와서 행값을 더해줌
            System.out.print(arr2[0][i]+" ");   //0*i를 출력함
        }
        System.out.println();

        for(int i = 0; i<arr2[1].length;i++){
            System.out.print(arr2[1][i]+" ");
        }
        System.out.println();

        for(int i=0; i<arr2[2].length;i++){
            System.out.print(arr2[2][i]+" ");
        }
        System.out.println();

        for(int j=0; j< arr2.length; j++){
            for(int i=0; i<arr2.length;i++){
                System.out.print(arr2[j][i]+" ");
            }
            System.out.println();
        }

    }
}
