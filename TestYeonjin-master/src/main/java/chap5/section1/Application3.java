package chap5.section1;

public class Application3 {
    public static void main(String[] args) {

        String[] shapes = {"SPADE","CLOVER","HEART","DIAMOND"};
        String[] cardNumber = {"ACE","2","3","4","5","6","7","8","9"};

        int randomShapeIndex = (int)(Math.random()* shapes.length);
//        System.out.println(randomShapeIndex); //0~3중 렌덤으로 출력됨
        int randomCardNumberIndex = (int)(Math.random()* cardNumber.length);

        System.out.println(shapes[randomShapeIndex]+cardNumber[randomCardNumberIndex]);

    }

}
