package chap5.section3;

public class Application1 {
    public static void main(String[] args) {
//        shallow copy
        int[] originArr = {1, 2, 3, 4, 5};
        int[] copyArr = originArr;

        System.out.println(originArr.hashCode());
        System.out.println(copyArr);    //[I@4c873330 >copyArr의 배열내용을 출력(originArr)
        System.out.println(copyArr.hashCode());  //1283928880 > 배열의 해시코드를 출력(cappyArr)

        for(int i=0; i <originArr.length; i++){
            System.out.println(copyArr[i]+" ");
        }
        System.out.println();

        for(int i = 0; i <copyArr.length; i++){
            System.out.println(copyArr[i]+" ");
        }
        System.out.println();

    }

}
